package AuladeHerança;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        // Fausto 12 991582872
        p1.setNome("Gustavo");
        p1.setIdade(21);
        p1.setSexo("M");

        p2.setNome("Pedro");
        p2.setIdade(15);
        p2.setSexo("M");

        p3.setNome("Rodolfo");
        p3.setIdade(45);
        p3.setSexo("M");

        p4.setNome("Adriana");
        p4.setIdade(32);
        p4.setSexo("F");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
}
