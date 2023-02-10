public class Usuario {
    
    private int cod_usuario;
    private String nome_usuario;
    private String end_logradouro;
    private int end_numero;
    private String end_complemento;
    private String end_bairro;
    private String end_cidade;
    private String edn_uf;
    private String end_cep;
    private String telefone;
    private String cpf;

    public Usuario(int cod_usuario, String nome_usuario, String end_logradouro, int end_numero, String end_bairro,  String end_cidade,
            String edn_uf) {
        this.cod_usuario = cod_usuario;
        this.nome_usuario = nome_usuario;
        this.end_logradouro = end_logradouro;
        this.end_numero = end_numero;
        this.end_bairro = end_bairro;
        this.end_cidade = end_cidade;
        this.edn_uf = edn_uf;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public String getEnd_logradouro() {
        return end_logradouro;
    }

    public void setEnd_logradouro(String end_logradouro) {
        this.end_logradouro = end_logradouro;
    }

    public int getEnd_numero() {
        return end_numero;
    }

    public void setEnd_numero(int end_numero) {
        this.end_numero = end_numero;
    }

    public String getEnd_complemento() {
        return end_complemento;
    }

    public void setEnd_complemento(String end_complemento) {
        this.end_complemento = end_complemento;
    }

    public String getEnd_bairro() {
        return end_bairro;
    }

    public void setEnd_bairro(String end_bairro) {
        this.end_bairro = end_bairro;
    }

    public String getEnd_cidade() {
        return end_cidade;
    }

    public void setEnd_cidade(String end_cidade) {
        this.end_cidade = end_cidade;
    }

    public String getEdn_uf() {
        return edn_uf;
    }

    public void setEdn_uf(String edn_uf) {
        this.edn_uf = edn_uf;
    }

    public String getEnd_cep() {
        return end_cep;
    }

    public void setEnd_cep(String end_cep) {
        this.end_cep = end_cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\n\nUsuario Nome, "+ nome_usuario + "\nCodigo do usuario: " + cod_usuario + 
        "\nEndereco: " + end_logradouro + ", " + end_numero + " " + end_bairro +
        "\nComplemento: " + end_complemento + 
        "\nCidade/UF: " + end_cidade + "-" + edn_uf + 
        "\nCep: " + end_cep + 
        "\nTelefone: " + telefone + "          CPF: " + cpf ;
    }

    

    

}
