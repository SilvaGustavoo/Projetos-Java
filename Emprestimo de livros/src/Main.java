
public class Main {

    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Harry Potter", "Alguem ae",2008, 2);
        Livro livro2 = new Livro("Percy Jackson", "Dom Paulo",2010, 1);

        Pessoa pessoa = new Pessoa("Gustavo Santos", 43302887524l);

        Emprestimo emprestimo = new Emprestimo(pessoa, livro1);

        Emprestimo emprestimo2 = new Emprestimo(pessoa, livro2); //Não implementado, pois a pessoa ja possui livro emprestado


        // Andre, ativação de cas a de embalagem 19 998851133

        System.out.println(emprestimo.toString()); // Mostra detalhes do emprestimo do livro
        emprestimo.devolverLivro(pessoa, livro1); // Devolução de Livro
        System.out.println("\n");

        System.out.println(livro1.toString()); // Informações do Livro
        System.out.println("\n");

        System.out.println(livro2.toString()); // Informações do Livro
        System.out.println("\n");

        System.out.println(emprestimo.toString() + "\n\n"); // Informações após devolução

        Emprestimo emprestimo3 = new Emprestimo(pessoa, livro2);
        System.out.println(emprestimo3.toString());

        
/*      System.out.println(dtf.format(gc.getTime()));
        System.out.println();
        gc.add(GregorianCalendar.DAY_OF_MONTH, 13);
        System.out.println(dtf.format(gc.getTime())); */


    }
    
}
