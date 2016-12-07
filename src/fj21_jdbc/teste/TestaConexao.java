package fj21_jdbc.teste;

import fj21_jdbc.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by sg-0036936 on 07/12/2016.
 */
public class TestaConexao {

    public static void main(String[] args) throws SQLException {

        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta");
        connection.close();

    }

}
