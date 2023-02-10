import java.util.ArrayList;
import java.util.List;

public class Departamento {
    
    private int cod_departamento;
    private String nome_departamento;
    private List<Funcionario> funcionarios;

    public Departamento(int cod_departamento, String nome_departamento) {
        this.cod_departamento = cod_departamento;
        this.nome_departamento = nome_departamento;
        funcionarios = new ArrayList<Funcionario>();
    }

    public int getCod_departamento() {
        return cod_departamento;
    }

    public String getNome_departamento() {
        return nome_departamento;
    }

    public void setNome_departamento(String nome_departamento) {
        this.nome_departamento = nome_departamento;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "\n\nDepartamento ("+ nome_departamento +") \nCódigo do departamento: " + cod_departamento  + 
        "\nFuncionarios: \n" + funcionarios;
    }


    

    
    
}
