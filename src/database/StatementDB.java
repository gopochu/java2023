package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDB {
    protected PreparedStatement preparedStatement;
    protected StatementDB statement;
    public StatementDB getStatement() {
        return statement;
    }
    public Statement StatementDB(Connection connection){
        try {
            statement = (StatementDB) connection.createStatement();
            System.out.println("Успешное подключение к statement");
        } catch (SQLException e) {
            throw new RuntimeException(e);    }
        return (Statement) statement;
    }
}
