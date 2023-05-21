package business_logic.user.authorization;

import database.DatabaseConnection;
import database.StatementDB;
import lombok.Setter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AuthorizationCheck {
    public static void main(String[] args) throws SQLException {
        takeCardInfo();
    }
    ReaderAuthorization readerAuthorization = new ReaderAuthorization();
    static PreparedStatement preparedStatement = null;
//    boolean checkCard;
//    {
//        checkCard = ReaderAuthorization.isCardInserted();
//    }
    @Setter
    public int takeBalance;
    @Setter
    public String takeName;
    @Setter
    public String takeSurname;
    static Scanner scanner = new Scanner(System.in);
    private static void takeCardInfo() throws SQLException {
        DatabaseConnection getConnection = new DatabaseConnection();
        Connection connection = getConnection.dbConnection();

        StatementDB getStatement = new StatementDB();

        String INSERT_NEW = "INSERT INTO java2023 (code, data, name, surname, cvv) VALUES(?, ?, ?, ?, ?)";
        System.out.println("Введите данные");
        int code = scanner.nextInt();
        int data = scanner.nextInt();
        String name = scanner.next();
        String surname = scanner.next();
        int cvv = scanner.nextInt();

        preparedStatement = connection.prepareStatement(INSERT_NEW);
        preparedStatement.setInt(1, code);
        preparedStatement.setInt(2, data);
        preparedStatement.setString(3, name);
        preparedStatement.setString(4, surname);
        preparedStatement.setInt(5, cvv);
        preparedStatement.execute();
    }
}