import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Emprestimo {

    private Pessoa pessoa;
    private Livro livro;
    private Date dtEmprestimo;
    private Date dtDevolucao;
    private Date dtDevolvido;

    DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL);
    Calendar gc = Calendar.getInstance();

    public Emprestimo(Pessoa pessoa, Livro livro) {
        if(pessoa.getPossuiLivro()) {
            System.out.println("Ja possui um livro emprestado!! \n\n");
        } else {
            this.pessoa = pessoa;
            this.livro = livro;
            this.dtEmprestimo = new Date(); // Data de emprestimo para o dia de hoje

            // Criar uma data de devolução maxima padrão de 10 dias (hoje + 10).
            gc.add(GregorianCalendar.DAY_OF_MONTH ,10);
            setDtDevolucao(gc.getTime());
            livro.setQtd(livro.getQtd()-1); // Diminui a quantidade de livros
            pessoa.setPossuiLivro(); // True
        }
    }

    public void devolverLivro(Pessoa pessoa, Livro livro) {
        livro.setQtd(livro.getQtd() + 1);
        livro.setDisponivel(true);
        this.dtDevolvido = new Date();
        pessoa.setPossuiLivro(); // False
        
        System.out.println("\nDevolvido com Sucesso!!\n");
    }


    public Date getDtEmprestimo() {
        return dtEmprestimo;
    }

    public void setDtEmprestimo(Date dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }

    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public Date getDtDevolvido() {
        return dtDevolvido;
    }

    public void setDtDevolvido(Date dtDevolvido) {
        this.dtDevolvido = dtDevolvido;
    }


    public String toString() {

// Quando criado um emprestimo vazio ocorre um erro, que é solucionado com o try.

        try { 
            pessoa.getPossuiLivro();
        } catch (NullPointerException e) {
            return "Não se pode emprestar outro livro, pois ainda possui um livro emprestado!!";
        } 

// Feito dessa maneira pois enquanto não possuir data de devolvido o sistema da erro. Por conta de variaveis tipo DATE não podem ser vazias.

        if (pessoa.getPossuiLivro()) {

        return "Emprestimo de Livro \nTitular\n" + pessoa.toString() + "\nLivro Emprestado\n" + livro.toString() + 
        "\nData do emprestimo: " + dtf.format(dtEmprestimo) + 
        "\nData prazo para devolucao: " + dtf.format(dtDevolucao) + 
        "\nData devolvido: Ainda emprestado"; 

        } else {

        return "Emprestimo de Livro \nTitular\n" + pessoa.toString() + "\nLivro Emprestado\n" + livro.toString() + 
        "\nData do emprestimo: " + dtf.format(dtEmprestimo) + 
        "\nData prazo para devolucao: " + dtf.format(dtDevolucao) +
        "\nData devolvido: " + dtf.format(dtDevolvido);
        } 
        
        
    }
    
}
