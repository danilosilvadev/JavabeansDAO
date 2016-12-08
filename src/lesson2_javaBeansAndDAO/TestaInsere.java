package lesson2_javaBeansAndDAO;

import java.util.Calendar;

/**
 * Created by sg-0036936 on 08/12/2016.
 */
public class TestaInsere {

    public static void main(String[] args){

        ContatoJavaBeans contatoJavaBeans =  new ContatoJavaBeans();
        contatoJavaBeans.setNome("Danilo");
        contatoJavaBeans.setEmail("danilosilvaweb@hotmail.com");
        contatoJavaBeans.setEndereco("Rua albertina");
        contatoJavaBeans.setDataNascimento(Calendar.getInstance());

        //save in this connection
        ContatoDAO dao = new ContatoDAO();

        //elegant method
        dao.adiciona(contatoJavaBeans);

        System.out.print("Saved!");

    }

}
