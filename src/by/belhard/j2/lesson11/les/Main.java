package by.belhard.j2.lesson11.les;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String URL =
            "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";

    public static void main(String[] args) {

        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            System.err.println(DRIVER_NAME + " loading failure");
            return;
        }

        Connection connection;
        List<Employee> employeesList = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement = connection.createStatement();

//            statement.execute("insert into employees values (null, 'Bruce', null, 150, current_date)");
            /*int result = statement.executeUpdate("delete from employees where name = 'Bruce'");
            System.out.println(result + " row(s) affected");*/
            String query = "select * from employees e " +
                    "left join specialties s on (e.specialty_id = s.id);";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("e.id");
                String name = resultSet.getString("name");
                int specialtyId = resultSet.getInt("specialty_id");
                String specialty = resultSet.getString("specialty");
                int salary = resultSet.getInt("salary");
                java.util.Date date = resultSet.getDate("date_of_employment");

                Employee empl = new Employee(id, name, new Specialty(specialtyId, specialty), salary, date);
                employeesList.add(empl);
                /*System.out.printf("%-2d) %-10s %-10s %5d  %5$td/%5$tm/%5$tY\n",
                        id, name, specialty, salary, date);*/
            }

//            query = "update employees set (salary = salary + ?) where salary < ?;";
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update employees set salary = salary + ? where name = ?;");

            int delta = 100;
            String nameIn = "'Victor'; insert into employees values (null, 'Maxim', 1, 1000000, default); commit();";

            preparedStatement.setInt(1, delta);
            preparedStatement.setString(2, nameIn);

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        employeesList.forEach(System.out::print);

    }
}
