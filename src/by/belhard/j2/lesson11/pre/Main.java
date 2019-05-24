package by.belhard.j2.lesson11.pre;

import java.sql.*;
import java.util.Date;

public class Main {

	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DRIVER_NAME);

		Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

		Statement statement = connection.createStatement();
		PreparedStatement preparedStatement = connection.prepareStatement("update employees set salary = salary + ? where name = ?;");
		preparedStatement.setInt(1, 100);
		preparedStatement.setString(2, "Chuck");
		preparedStatement.executeUpdate();

		ResultSet resultSet = statement.executeQuery(
				"select e.id as id, name, specialty, salary, date_of_employment as date from employees e join specialties s on (e.specialty_id = s.id) order by e.id;");

		//		int resultedRows = statement.executeUpdate("insert into employees values (null, 'Paul', null, 10, current_date);");
		//		System.out.println(resultedRows + " row(s) affected");

		showList(resultSet);

		System.out.println("end");
	}

	private static void showList(ResultSet resultSet) throws SQLException {

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String specialty = resultSet.getString("specialty");
			int salary = resultSet.getInt("salary");
			Date date = resultSet.getDate("date");

			System.out.printf("%-2d) %-10s %-10s %5d  %5$td/%5$tM/%5$tY\n", id, name, specialty, salary, date);
		}
	}

}