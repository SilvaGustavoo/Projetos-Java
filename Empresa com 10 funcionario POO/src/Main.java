
public class Main {
    public static void main(String[] args) {

        Holerite[] funcLista = new Holerite[10]; // Lista de Holerites dos funcionarios

        for (int i = 0; i < funcLista.length; i++) {     
            Funcionario x = new Funcionario();
            x.coletarDados();      
            funcLista[i] = new Holerite(x);
        }

        

        for (int i = 0; i < funcLista.length; i++) {
            System.out.println(funcLista[i].toString());
        } 

    }

}
