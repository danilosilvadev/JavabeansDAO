package lesson1_jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sg-0036936 on 07/12/2016.
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/javaee_learning", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
