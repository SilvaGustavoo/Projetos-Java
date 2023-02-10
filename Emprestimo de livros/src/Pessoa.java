public class Pessoa {

    private String nome;
    private int idade;
    private String endereco;
    private long cpf;
    private boolean possuiLivro;

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setPossuiLivro() {
        this.possuiLivro = !this.possuiLivro;
    }

    public boolean getPossuiLivro() {
        return this.possuiLivro;
    }

    public void fazerAniversario() {
        this.idade++;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [nome: " + nome + ", idade: " + idade + ", endereco: " + endereco + ", cpf: " + cpf + "]";
    }
    
    
    
}
