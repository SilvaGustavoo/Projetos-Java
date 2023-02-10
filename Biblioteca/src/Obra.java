public class Obra {
    
    private int cod_obra;
    private String titulo;
    private String autor;
    private int ano;
    private int situacao;
    private String tipo_obra;
    private Editora editora;

    public Obra(int cod_obra, String titulo, String autor, int ano, int situacao, String tipo_obra, Editora editora) {
        this.cod_obra = cod_obra;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.situacao = situacao;
        this.tipo_obra = tipo_obra;
        this.editora = editora;
    }

    public int getCod_obra() {
        return cod_obra;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getSituacao() {
        switch(situacao) {
            case 1:
                return "Disponivel";
            case 0:
                return "Emprestado";
            default:
                return "Numero inválido " + situacao;
        }
    }


    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getTipo_obra() {
        return tipo_obra;
    }

    public Editora getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Obra Titulo, " + titulo + "\nCódigo da obra: " + cod_obra + 
        "\nAutor: " + autor + 
        "\nAno: " + ano + 
        "\nSituacao: " + getSituacao() + 
        "\nTipo de obra: " + tipo_obra + 
        "\nEditora: " + editora.getNome_editora();
    }

    

    


}