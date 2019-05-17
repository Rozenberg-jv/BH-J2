create database company;
use company;

create table specialties (
	id int auto_increment primary key,
    specialty varchar(45) not null unique
);

create table employees (
	id int auto_increment primary key,
    name varchar(45) not null,
    specialty_id int,
    salary int not null check (salary > 0),
    date_of_employment date not null default '2019-01-01',
    foreign key (specialty_id) references specialties(id)
);

create table projects (
	id int auto_increment primary key,
    title varchar(127) not null,
    country varchar(45) not null
);

create table employees_to_projects (
	empl_id int,
    proj_id int,
    primary key (empl_id, proj_id),
    foreign key (empl_id) references employees(id) on delete cascade on update cascade,
	foreign key (proj_id) references projects(id)
);

drop table specialties;
drop table employees;
drop table employees_to_projects;

select * from specialties order by id;
select * from employees order by id;
select * from projects;
select * from employees_to_projects;

insert into specialties values (null, 'Developer'), (null, 'QA'), (null, 'BA'), (null, 'DevOps'), (null, 'HR');
insert into employees values (null, 'Alice', 3, 1500, '2017-05-03'), (null, 'Bob', 2, 1000, '2016-12-21'), (null, 'Carol', 5, 900, '2018-04-12'), 
							(null, 'Chuck', 4, 1600, default), (null, 'Creig', 5, 1500, default), (null, 'Dave', 1, 1100, '2012-10-02'), 
							(null, 'Eve', 2, 1600, '2018-05-03'), (null, 'Mallory', 3, 800, '2019-02-18'), (null, 'Victor', 1, 900, '2017-07-25'), 
                            (null, 'Vladimir', 2, 1500, default), (null, 'Valerie', 5, 900, default), (null, 'Walter', 1, 2000, default);
insert into projects values (null, 'Online market', 'USA'), (null, 'Banking system', 'Russia');
insert into employees_to_projects values (1,1),(2,1),(3,2),(4,1),(5,1),(7,2),(8,1),(6,2),(10,2),(9,1),(4,2),(10,1);

/* данные по сотрудникам на проектах из страны 'USA' */
select p.country, p.title, e.id, e.name, s.specialty, e.salary, e.date_of_employment as date 
	from employees e 
    join employees_to_projects ep on (e.id = ep.empl_id) 
    join projects p on (ep.proj_id = p.id) 
    join specialties s on (e.specialty_id = s.id) 
		where p.country = 'USA'
		order by specialty, salary desc;

/* данные по сотрудникам со специальностями */        
select e.id, e.name, s.specialty as spec, e.salary, e.date_of_employment as 'date' from employees e join specialties s on (e.specialty_id = s.id) order by spec;

/* сводка зарплат по специальностям (количество сотрудников, общая зарплата, средняя зарплата) */
select specialty, count(specialty) as 'count', sum(salary) as 'sum', avg(salary) as 'avg' from specialties s 
	join employees e on (s.id = e.specialty_id)
		group by specialty order by sum;

/* сводка сотрудников с проектами */
select e.id, e.name, p.title, p.country from employees e 
	join employees_to_projects etp on (e.id = etp.empl_id)
    join projects p on (etp.proj_id = p.id);
    
/* сводка всех сотрудников по проектам */
select e.id, e.name, ifnull(p.title,'---') as 'project title', ifnull(p.country,'---') as 'project county' from employees e 
	left join employees_to_projects etp on (e.id = etp.empl_id)
    left join projects p on (etp.proj_id = p.id);

/* работники без проекта */
select e.id, e.name, 'no project' as status from employees e 
	left join employees_to_projects etp on (e.id = etp.empl_id) 
		where etp.proj_id is null;
