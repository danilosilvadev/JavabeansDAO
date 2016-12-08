package lesson2_javaBeansAndDAO;

import lesson1_jdbc.jdbc.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
                "(nome, email, endereco, dataNascimento)" + "values (?, ?, ?, ?)";
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

        public List<ContatoJavaBeans> getLista() {
            try {
                List<ContatoJavaBeans> contatoJavaBeansList = new ArrayList<ContatoJavaBeans>();
                PreparedStatement statement = this.connection.prepareStatement("select * from contato");
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()){

                    //Creating the object

                    ContatoJavaBeans contatoJavaBeans = new ContatoJavaBeans();
                    contatoJavaBeans.setId(resultSet.getLong("id"));
                    contatoJavaBeans.setNome(resultSet.getString("nome"));
                    contatoJavaBeans.setEmail(resultSet.getString("email"));
                    contatoJavaBeans.setEndereco(resultSet.getString("endereco"));

                    //Making date throught calendar

                    Calendar data = Calendar.getInstance();
                    data.setTime(resultSet.getDate("dataNascimento"));
                    contatoJavaBeans.setDataNascimento(data);

                    //Adding the object to the list

                    contatoJavaBeansList.add(contatoJavaBeans);
                }

                resultSet.close();
                statement.close();
                return contatoJavaBeansList;
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
        }


}
