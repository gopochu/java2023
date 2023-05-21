package database;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private String url = "jdbc:mysql://localhost/lrndb";
    private String username = "root";
    private String password = "LvS27310";

    @Getter
    protected Connection connection;

    public Connection dbConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Успешное подключение к базе данных");
        } catch (SQLException e) {
            System.out.println("Сбой подключения к базе данных");
            throw new RuntimeException(e);
        }
        return connection;
    }
}