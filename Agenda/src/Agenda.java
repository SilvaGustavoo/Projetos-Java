import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {

    private Date data;
    private List<Pessoa> listPessoas;

    DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL);

    public Agenda(Date data) {
        this.data = data;
    }

    public void armazenaPessoa(Pessoa pessoa) {
        System.out.println("Adicionado com sucesso!!");
        this.listPessoas.add(pessoa);
    }

    public void removePessoa(Pessoa pessoa) {
        System.out.println("Removido com sucesso!!");
        this.listPessoas.remove(pessoa);
    }

    public int buscaPessoa(String nome) {
        for (Pessoa pessoa : listPessoas) {

            if (pessoa.getNome().equals(nome)) {
                System.out.print("A pessoa com nome " + nome + " está na posição " + (this.listPessoas.indexOf(pessoa)+1) + " da agenda.");
                return this.listPessoas.indexOf(pessoa);
            }         
        }

        System.out.println("Nome digitado é invalido");
        return -1;
    }

    public void imprimeAgenda() {
        System.out.println("Agenda do Dia \n" + dtf.format(data));

        for (int i = 0; i < this.listPessoas.size(); i++) {

            System.out.println(this.listPessoas.get(i).toString());
        }

    }

    public void imprimePessoa(int posicao) {
        System.out.println( this.listPessoas.get(posicao).toString());
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Pessoa> getListPessoas() {
        return listPessoas;
    }

    public void setListPessoas(List<Pessoa> listPessoas) {
        this.listPessoas = listPessoas;
    }

    
}
