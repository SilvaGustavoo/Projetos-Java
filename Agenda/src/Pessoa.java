public class Pessoa {
    
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void fazerAniversario() {
        this.idade++;
    }
    
    public String getNome() {
        return nome;
    }

    // cassio 

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", idade: " + idade + ", altura: " + altura + ";";
    }

    

    
}
