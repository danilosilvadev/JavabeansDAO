package lesson2_javaBeansAndDAO;

import lesson1_jdbc.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by sg-0036936 on 08/12/2016.
 */
public class ContatoDAO {

    private Connection connection;

    public ContatoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(ContatoJavaBeans contatoJavaBeans){
        String sql = "insert into contato" +
                "(nome, email, endereço, dataNascimento)" + "values (?, ?, ?, ?)";
        try {
            //prepared statement to insertion
            PreparedStatement statement = connection.prepareStatement(sql);
            //set the values
            statement.setString(1, contatoJavaBeans.getNome());
            statement.setString(2, contatoJavaBeans.getEmail());
            statement.setString(3, contatoJavaBeans.getEndereco());
            statement.setString(4, String.valueOf(new Date(
                    contatoJavaBeans.getDataNascimento().getTimeInMillis()
            )));

            //execute
            statement.execute();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
