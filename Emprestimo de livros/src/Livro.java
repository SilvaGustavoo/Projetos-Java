public class Livro {

    private String nomeLivro;
    private String autor;
    private String editora;
    private int qtd;
    private int ano;
    private boolean disponivel;

    public Livro(String nomeLivro, String autor, int ano, int qtd) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.ano = ano;
        this.qtd = qtd;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getAno() {
        return ano;
    }

    public boolean getDisponivel() {
        if(this.qtd < 1) {
            this.disponivel = false;
        } else {
            this.disponivel = true;
        }
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Nome do livro: " + nomeLivro + 
        "\nAutor: " + autor + 
        "\nEditora: " + editora +  
        "\nAno: " + ano + 
        "\nQuantidade: " + qtd + 
        "\nDisponibilidade: " + getDisponivel();
    }

    
    
}
