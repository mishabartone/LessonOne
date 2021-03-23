package HomeWork18;

import java.sql.*;
import java.util.Scanner;

public class TestConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        init();

        try (Connection connection = getConnection()){
            createDb(connection);
            resultSet(connection);

            cleareTable(connection);

            prepare(connection);
            resultSet(connection);

            transactions(connection);
            resultSet(connection);
        }
    }

    public static void init() throws ClassNotFoundException {
        Class.forName("org.h2.Driver");
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:TestConnection.s2db");

        return connection;
    }

    public static void createDb(Connection connection) throws SQLException {
        try(Statement statement = connection.createStatement()){

            String sql = "CREATE TABLE  IF NOT EXISTS users " +
                    "(ID                INT PRIMARY KEY NOT NULL," +
                    " LOGIN             TEXT NOT NULL, " +
                    " PASSWORD          CHAR(15))";

            statement.executeUpdate(sql);
        }
    }

    public static void cleareTable(Connection connection) throws SQLException {
        try(Statement statement = connection.createStatement()){
            statement.executeUpdate("DELETE FROM USERS");
        }
    }

    public static void resultSet(Connection connection) throws SQLException{
        try (Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + " "
                        + resultSet.getString("login") + " "
                        + resultSet.getString("password"));
            }
            System.out.println("-------------------------------------");
        }
    }

    public static void prepare(Connection connection) throws SQLException{
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (ID, LOGIN, PASSWORD) VALUES (?, ?, ?)")){
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "User1");
            preparedStatement.setString(3, "qwerty1");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "User2");
            preparedStatement.setString(3, "qwerty2");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "User3");
            preparedStatement.setString(3, "qwerty3");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "User4");
            preparedStatement.setString(3, "qwerty4");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, "User5");
            preparedStatement.setString(3, "qwerty5");
            preparedStatement.addBatch();

            preparedStatement.executeBatch();
        }
    }

    public static void transactions(Connection connection) throws SQLException{
        try (Statement statement = connection.createStatement()){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your old login");
            String loginOld = sc.nextLine();
            System.out.println("Please enter your new login");
            String loginNew = sc.nextLine();

            connection.setAutoCommit(false);
            statement.executeUpdate("UPDATE users SET LOGIN='" + loginNew + "' WHERE LOGIN='" + loginOld + "'");
            connection.commit();
            connection.setAutoCommit(true);
        }
    }

}
