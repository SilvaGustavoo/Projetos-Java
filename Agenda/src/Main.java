import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL);
        Agenda agenda = new Agenda(new Date()); // Agenda no dia de hoje

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa pessoa1 = new Pessoa("Gustavo Santos", 20, 1.50f);
        Pessoa pessoa2 = new Pessoa("Pedrinho Avocado", 35, 1.65f);
        Pessoa pessoa3 = new Pessoa("Vitor Ando", 22, 1.70f);
        Pessoa pessoa4 = new Pessoa("Paula Tejando", 40, 1.78f);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);



        agenda.setListPessoas(pessoas);

        agenda.imprimeAgenda();

        System.out.println("\n");

        agenda.removePessoa(pessoa4);

        agenda.imprimeAgenda();

        System.out.println("\n");

        agenda.armazenaPessoa(pessoa4);

        agenda.imprimeAgenda();

        System.out.println("\n");

        agenda.buscaPessoa("Gustavo Santos");

        System.out.println("\n");

        agenda.imprimePessoa(1);

        System.out.println();





    }
}
