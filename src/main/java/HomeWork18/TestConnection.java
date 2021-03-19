package HomeWork18;

import java.sql.*;

public class Main {

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    public static void main(String[] args) throws ClassNotFoundException {
        setConnection();
    }

    public static void setConnection() throws ClassNotFoundException {
        connection = null;
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("org.sqlite:JDBC")
    }

}
