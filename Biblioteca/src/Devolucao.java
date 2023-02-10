import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Devolucao {
    
    private Emprestimo emprestimo;
    private Date dt_devolucao;
    private Date hora_devolucao;
    private Funcionario funcionario;

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

    Calendar gc = Calendar.getInstance();

    public Devolucao(Emprestimo emprestimo, Funcionario funcionario) {
        this.emprestimo = emprestimo;
        this.dt_devolucao = gc.getTime();
        this.hora_devolucao = gc.getTime();
        this.funcionario = funcionario;
        this.emprestimo.getObra().setSituacao(1);
    }

    public Date dataDevolvida() {
        Date coletarDev = dt_devolucao;
        return coletarDev;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public String getDt_devolucao() {
        return df.format(dt_devolucao);
    }

    public String getHora_devolucao() {
        return sdf.format(hora_devolucao);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setDt_devolucao(Date dt_devolucao) {
        this.dt_devolucao = dt_devolucao;
    }

    public void setHora_devolucao(Date hora_devolucao) {
        this.hora_devolucao = hora_devolucao;
    }

    @Override
    public String toString() {
        return "\n\nDevolucao \nCodigo do Emprestimo: " + emprestimo.getCod_emprestimo() + 
        "\nData da devolução: " + getDt_devolucao() + 
        "\nHora da devolução: " + getHora_devolucao() + 
        "\nFuncionario: " + funcionario.getNome_funcionario();
    }


    

    
    
}
