package lesson2_javaBeansAndDAO;

/**
 * Created by sg-0036936 on 08/12/2016.
 */
public class TestaRemoveEAltera {

    public static void main(String[] args){

        ContatoJavaBeans contatoJavaBeans = new ContatoJavaBeans();
        ContatoDAO contatoDAO = new ContatoDAO();
        //contatoDAO.remove((Long) contatoJavaBeans.getId(2));
        //contatoDAO.altera(contatoJavaBeans.getId());

        System.out.print("Erased and updated!");

    }

}
