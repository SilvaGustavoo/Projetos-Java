import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Emprestimo {
    
    private int cod_emprestimo;
    private Obra obra;
    private Usuario usuario;
    private Date dt_emprestimo;
    private Date horario_emprestimo;
    private Date previsao_retorno;
    private Funcionario funcionario;


    Calendar gc = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    DateFormat dtf = DateFormat.getDateInstance(DateFormat.SHORT);
         

    public Emprestimo(int cod_emprestimo, Obra obra, Usuario usuario, Funcionario funcionario) {
        this.cod_emprestimo = cod_emprestimo;
        this.obra = obra;
        this.usuario = usuario;
        this.dt_emprestimo = gc.getTime();
        this.horario_emprestimo = gc.getTime();
        gc.add(GregorianCalendar.DAY_OF_MONTH, 10);
        this.previsao_retorno = gc.getTime();
        this.funcionario = funcionario;
        this.obra.setSituacao(0);


    }

    public Date dataEmprestada() {
        Date dataEmp = dt_emprestimo;
        return dataEmp;
    }

    public int getCod_emprestimo() {
        return cod_emprestimo;
    }

    public Obra getObra() {
        return obra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDt_emprestimo() {
        return dtf.format(dt_emprestimo);
    }

    public String getHorario_emprestimo() {
        return sdf.format(horario_emprestimo);
    }

    public String getPrevisao_retorno() {
        return dtf.format(previsao_retorno);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public void setPrevisao_retorno(Date previsao_retorno) {
        this.previsao_retorno = previsao_retorno;
    }

    @Override
    public String toString() {
        return "\n\nEmprestimo de Obra \nCódigo do emprestimo: " + cod_emprestimo + 
        "\nObra: " + obra.getTitulo() + 
        "\nUsuario: " + usuario.getNome_usuario() + 
        "\nData do emprestimo: " + getDt_emprestimo() + 
        "\nHora do emprestimo: " + getHorario_emprestimo() + 
        "\nRetorno previsto: " + getPrevisao_retorno() + 
        "\nFuncionario: " + funcionario.getNome_funcionario();
    }

    

    


}
