package lesson2_javaBeansAndDAO;

import java.util.List;

/**
 * Created by sg-0036936 on 08/12/2016.
 */
public class TestaLista {

    public static void main(String[] args){

        ContatoDAO contatoDAO = new ContatoDAO();

        List<ContatoJavaBeans> contatos = contatoDAO.getLista();

        for (ContatoJavaBeans contatoJavaBeans: contatos){

            System.out.println("Nome: " + contatoJavaBeans.getNome());
            System.out.println("Email: " + contatoJavaBeans.getEmail());
            System.out.println("endereço: " + contatoJavaBeans.getEndereco());
            System.out.println("Nascimento: " + contatoJavaBeans.getDataNascimento());

        }
    }

}
