public class Editora {

    private int cod_editora;
    private String nome_editora;
    private String cidade;

    public Editora(int cod_editora, String nome_editora, String cidade) {
        this.cod_editora = cod_editora;
        this.nome_editora = nome_editora;
        this.cidade = cidade;
    }

    public int getCod_editora() {
        return cod_editora;
    }

    public String getNome_editora() {
        return nome_editora;
    }
    
    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "\n\nEditora "+ nome_editora + 
        "\nCódigo da editora: " + cod_editora + 
        "\nCidade: " + cidade;
    }

    

    
}
