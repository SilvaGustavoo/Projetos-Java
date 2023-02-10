import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    private List<Funcionario> funcionarios;
    private List<Departamento> departamentos;
    private List<Usuario> usuarios;
    private List<Obra> obras;
    private List<Emprestimo> emprestimos;
    private List<Devolucao> devolucoes;
    private List<Editora> editoras;

    

    // Cria o banco de dados ja inicializando os Arrays
    public BancoDeDados() {
        funcionarios = new ArrayList<Funcionario>();
        departamentos = new ArrayList<Departamento>();
        usuarios = new ArrayList<Usuario>();
        obras = new ArrayList<Obra>();
        emprestimos = new ArrayList<Emprestimo>();
        devolucoes = new ArrayList<Devolucao>();
        editoras = new ArrayList<Editora>();
        alterarSituacao();
    }

    public void alterarSituacao() {
        for(Emprestimo emprestimo : emprestimos){
            emprestimo.getObra().setSituacao(0);

            for(Devolucao devolucao : devolucoes) {
                if(emprestimo.dataEmprestada().compareTo(devolucao.dataDevolvida()) <= 0){
                    devolucao.getEmprestimo().getObra().setSituacao(1);
                }
            }
        }

        
    }

    // Getters
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public List<Obra> getObras() {
        return obras;
    }
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public List<Devolucao> getDevolucoes() {
        return devolucoes;
    }
    public List<Editora> getEditoras() {
        return editoras;
    }

    // emissao de gta cadastrar - 

    
    

    
}
