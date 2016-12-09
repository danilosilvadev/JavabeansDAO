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

        //new contact

        ContatoJavaBeans contatoJavaBeans2 =  new ContatoJavaBeans();
        contatoJavaBeans2.setNome("Ícaro");
        contatoJavaBeans2.setEmail("icarojosias@hotmail.com");
        contatoJavaBeans2.setEndereco("Rua turiaçú");
        contatoJavaBeans2.setDataNascimento(Calendar.getInstance());

        //save in this connection
        ContatoDAO dao2 = new ContatoDAO();

        //elegant method
        dao2.adiciona(contatoJavaBeans2);

        System.out.print("Saved again!");



    }



}
