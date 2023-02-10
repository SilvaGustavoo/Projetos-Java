import java.util.List;

public class Funcionario {
    
    private int cod_funcionario;
    private String nome_funcionario;
    private Departamento departamento;
    
    public Funcionario(int cod_funcionario, String nome_funcionario, Departamento departamento) {
        this.cod_funcionario = cod_funcionario;
        this.nome_funcionario = nome_funcionario;    
        this.departamento = departamento;
        
    }

    public int getCod_funcionario() {
        return cod_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Código do funcionario: " + cod_funcionario + "\nNome: " + nome_funcionario
                + "\nDepartamento: " + departamento.getNome_departamento() + "\n";
    }

    

    
}
