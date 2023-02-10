public class IdentificarErros {
    
    public static void main(String[] args) {
        int idade = 0;
        // Faltou a declaração da variavel e a abertura ods colchetes para a entrada dos dados.
        if (idade >= 65) {
            System.out.println("Melhor idade");
        } 


        // Faltou a declaração da unidade, e na adição de ; na linha do Masculino e somente um = ao inves de == na declaração de igualdade
        int genero = 0;

        if (genero == 1) {
            System.out.println("Masculino");
        } else {
            System.out.println("Feminino");
        }

        // Não houve a declaração da variavel, alem de adicionar parenteses onde ocorre o metodo boleano 
        double preco = 0;
        if(preco > 10.5) {
            preco = preco*1.2;
        } else {
            preco = preco * 1.35;
        }
    }
}
