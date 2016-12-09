package lesson2_javaBeansAndDAO;

import java.util.Calendar;

/**
 * Created by sg-0036936 on 08/12/2016.
 */
public class TestaRemoveEAltera {

    public static void main(String[] args){


        ContatoDAO contatoAltera = new ContatoDAO();
        ContatoJavaBeans contato2 = new ContatoJavaBeans();
        contato2.setNome("Norbert");
        contato2.setEmail("norbert@noob.com");
        contato2.setEndereco("rua francisco");
        contato2.setDataNascimento(Calendar.getInstance());
        contato2.setId(Long.valueOf(1));

        contatoAltera.altera(contato2);


        ContatoJavaBeans contato3 = new ContatoJavaBeans();
        contato3.setId(Long.valueOf(10));
        contatoAltera.remove(contato3);


        System.out.print("Erased and updated!");

    }

}
