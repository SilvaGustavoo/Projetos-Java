import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        BancoDeDados bd = gerarDados();

        System.out.println("\nPrazer, sou o Gustavo Santos.");

        System.out.println("Esse sistema é semelhante a de uma Biblioteca, servindo para realizar devoluções ou emprestimos de alguma 'Obra'. Foi usado como base, um dos conhecimentos aprendidos nas aulas de Back-End da STACKX e de modelagem de banco de dados, nas aulas de Modelagem de Dados");
        System.out.println("Professora de Back-End: Beatriz Rezener" + "\nProfessor de Modelagem de dados: Laurindo Dumba\n");

        System.out.println("Login como Funcionario comum pode se digitar qualquer coisa \nPara Gerente, usuario && senha = admin\n");

        try {
            sistema();
        } catch (Exception e) {
            System.out.println("\n\nVocê digitou uma letra ou nada, quando solicitado um numero.. Por conta disso o sistema apresentou um erro e será reiniciado\n");
            sistema();
        }
        

    }


    private static void sistema() {

        Scanner leitor = new Scanner(System.in);
        boolean gerente = false;
        boolean laco = true;
        String opcao = "";
        boolean retornar = false;   // usado para confirmar o retorno a pagina anterior
        int contador = 0;           //Usado para contar quantas vezes o usuario errou algo
        BancoDeDados bd = gerarDados();
        Funcionario log_funcionario;

        System.out.println( "BEM VINDO A BIBLIOTECA");
        System.out.println("Login de Funcionario");
        System.out.print("Usuario: ");
        String user = leitor.nextLine();
        System.out.print("Senha: ");
        String senha = leitor.nextLine();
        log_funcionario = bd.getFuncionarios().get(0);
        
        

        // Validação de Usuário

        if(user.equals("admin") && senha.equals(senha)) {
            gerente = true;
            log_funcionario = bd.getFuncionarios().get(3);
            System.out.println("Bem-vindo Gerente!!");
        }


        System.out.println("\n");

        

        // Pagina Inicial 1° Laço
        while(laco){
            bd.alterarSituacao();
            laco = true;
            retornar = false;
            System.out.println("SERVIÇOS DA BIBLIOTECA - BEM VINDO(A)");
            System.out.println("Digite o numero referente a função desejada.");
            System.out.println("1 - Realizar um novo cadastro. \n" +
            "2 - Buscar. \n" +
            "3 - Emprestimo de Livro. \n" +
            "4 - Devolucao de livro \n" +
            "5 - Sair");
            System.out.print("Digite o numero: ");
            int categoria = leitor.nextInt();
            leitor.nextLine();

            clearConsole();

            switch(categoria) {
                case 1:
                    System.out.println("\nDigite o numero referente a opcao que deseja realizar o cadastro.");
                    System.out.println("1 - Cadastrar obra\n" + 
                    "2 - Cadastrar usuario\n" + 
                    "3 - Cadastrar editora");
                    if(gerente) {
                        System.out.println("4 - Cadastrar funcionario\n" + 
                        "5 - Cadastrar departamento");
                    }
                    System.out.println("0 - Retornar");
                    System.out.print("Digite o numero referente a opcao desejada: ");
                    opcao = leitor.nextLine();
                    break;


                case 2:
                    System.out.println("\nOque deseja buscar? *Digite um numero*");
                    System.out.println("1 - Obra\n" +
                    "2 - Usuario\n" +
                    "3 - Emprestimos\n" + 
                    "4 - Devolucoes\n" +
                    "5 - Editora");
                    if(gerente) {
                        System.out.println("6 - Funcionarios\n" +
                        "7 - Departamentos");
                    }
                    System.out.println("0 - Retornar");
                    System.out.print("Digite o numero desejado: ");
                    opcao = leitor.nextLine();
                    break;


                case 3: //CRIAR UM NOVO EMPRESTIMO

                    // Necessario inicializar para começar o sistema.
                    Usuario usuario = new Usuario(0, senha, senha, 0, opcao, user, senha);
                    Obra obra = new Obra(0, opcao, user, 0, 0, senha, null);
                    

                    // Laço de repitição para entrada de dados
                    while(laco) {
                        System.out.print("Digite o código do usuario: ");
                        int codusuario = leitor.nextInt();
                        boolean valido = false;
            

                        for (Usuario val_usuario : bd.getUsuarios()) {
                            if(codusuario == val_usuario.getCod_usuario()) {
                                valido = true;
                                usuario = val_usuario;
                            }
                        }

                        // Se for valido o código sai do ciclo de repetiçao
                        if(valido) {
                            break;
                        }


                        clearConsole();
                        System.out.println("Usuario "+ codusuario +" inválido ou inexistente!!");

                        // Se errar mais de 1 vezes executa o IF
                        if(contador > 0) {
                            System.out.print("Se não lembra o código do usuário. Deseja retornar ao menu e realizar uma pesquisa? [S/N]");
                            leitor.nextLine();
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                contador = 0;
                                break;
                            }
                        }

        
                        contador++;

                    } while(laco) {

                        System.out.print("Digite o código da obra: ");
                        int cod_obra = leitor.nextInt();
                        boolean valido = false;
                        
                        
                        for (Obra val_obra : bd.getObras()) {
                            if(cod_obra == val_obra.getCod_obra()) {
                                valido = true;
                                obra = val_obra; 
                            }
                        }

                        // Valida e sai do While
                        if(valido) {
                            break;
                        }

                        clearConsole();
                        System.out.println("Obra "+ cod_obra +" inválido ou inexistente!!");

                        // Se errar mais de 1 vez, aciona o IF
                        if(contador > 1) {
                            System.out.print("Se não lembra o código da obra. Deseja retornar ao menu e realizar uma pesquisa? [S/N]");
                            opcao = leitor.nextLine().toLowerCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                contador = 0;
                                break;
                            }
                        }

                        contador++;
                    }


                    // Auto-Incremento de emprestimo
                    int eMaior = 0;


                    // Realiza a busca no 'Banco de Dados'
                    for(Emprestimo emprestimo : bd.getEmprestimos()) {
        
                        if(emprestimo.getCod_emprestimo() > eMaior) {
                            eMaior = emprestimo.getCod_emprestimo();
                        }
                    }

                    // Verifica se a Obra está disponivel e cria o Emprestimo
                    if(obra.getSituacao().equals("Disponivel")) {
                        Emprestimo emprestimo = new Emprestimo((eMaior+1), obra, usuario, log_funcionario);
                        bd.getEmprestimos().add(emprestimo);
                        System.out.println("LIVRO EMPRESTADO COM SUCESSO!!\n\n");
                        retornar = true;
                    } else {
                        System.out.println("Esta obra não está Disponivel no momento. Escolha uma diferente.");
                        retornar = true;
                        clearConsole();
                    }

                    break;

                case 4:         // CRIAR UMA DEVOLUÇÃO DE OBRA

                    System.out.println("DEVOLUÇÃO DE OBRA");
                    String cod_emprestimo;
                    boolean valido = false;
                    
                    Emprestimo dev_emprestimo = bd.getEmprestimos().get(0);

                    while(laco) {
                        System.out.print("Digite o codigo do empréstimo: ");
                        cod_emprestimo = leitor.nextLine();

                        try {
                            Integer.valueOf(cod_emprestimo);
                        } catch (Exception e) {
                            System.out.println("código inválido");
                            clearConsole();
                            continue;
                        }

                        for(Emprestimo emprestimo : bd.getEmprestimos()) {
                            if(Integer.valueOf(cod_emprestimo) == emprestimo.getCod_emprestimo()){
                                dev_emprestimo = emprestimo;
                                valido = true;
                            }
                        }

                        if(valido) {
                            break;
                        }

                        System.out.println("Código de emprestimo "+ cod_emprestimo +" informado é invalido");

                        if(contador > 0) {
                            System.out.print("Se não lembra o código do emprestimo. Deseja retornar ao menu e realizar uma pesquisa? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                contador = 0;
                                break;
                            }
                        }

                        contador++;
                        clearConsole();
                    }

                    if(dev_emprestimo.getObra().getSituacao().equals("Emprestado")) {
                        Devolucao devolucao = new Devolucao(dev_emprestimo, log_funcionario);
                        bd.getDevolucoes().add(devolucao);
                        System.out.println("DEVOLVIDO COM SUCESSO !! \n\n");
                    } else {
                        System.out.println("Esta obra ja foi devolvida!!\n\n");
                    }
                    

                    break;

                case 5:
                    clearConsole();
                    sistema();
    
                default:
                    System.out.println("Opcao invalida digite novamente");
                    retornar = true;
                    break;
            }


            // Verifica a opção digitada, caso de erro da um novo valor
            try {
                Integer.valueOf(opcao);
            } catch (Exception e) {
                opcao = "0";
            }

            // Retorna ao 1º laço
            if(retornar || Integer.valueOf(opcao) == 0) {
                continue;
            }


            // Inicio de outro ciclo, o de NOVOS CADASTROS e de BUSCA 

            if(categoria == 1){
            int eMaior = 0;
            switch(Integer.valueOf(opcao)) {
                case 1:
                    System.out.println("CADASTRAR OBRA");
                    System.out.println("Lembrete: Para cadastrar uma nova Obra é necessario ter sido cadastrado a editora primeiro!!");
                    System.out.print("A editora ja foi cadastrada? [S/N]");
                    opcao = leitor.nextLine().toUpperCase();

                    if(!opcao.equals("S")) {
                        retornar = true;
                        break;
                    }
                    System.out.println("\n");

                    System.out.print("Digite o titulo da obra: ");
                    String titulo = leitor.nextLine();

                    System.out.print("Digite o autor da obra: ");
                    String autor = leitor.nextLine();

                    System.out.print("Digite o ano da obra: ");
                    int ano = leitor.nextInt();

                    System.out.print("Digite o tipo da obra(Terror, ficção, etc): ");
                    leitor.nextLine();
                    String tipo_obra = leitor.nextLine();

                    boolean valido = false;
                    Editora editora = bd.getEditoras().get(0);

                    while(laco) {
                        
                        System.out.print("Digite o codigo da editora: ");
                        String cod_editora = leitor.nextLine();

                        // caso de algum erro
                        try {
                            Integer.valueOf(cod_editora);
                        } catch (Exception e) {
                            clearConsole();
                            System.out.println("Codigo invalido");
                            continue;
                        }

                        
                        for(Editora val_editora : bd.getEditoras()) {
                            if(Integer.valueOf(cod_editora) == val_editora.getCod_editora()) {
                                valido = true;
                                editora = val_editora;
                                break;
                            }
                        }

                        if(valido) {
                            break;
                        }
                    

                        clearConsole();
                        System.out.println("Código " + cod_editora +", inválido ou Inexistente");

                        contador++;

                        // Sub-Tarefa com o mesmo objetivo de retornar ao menu principal
                        if(esqueceuCodigo(contador)) {
                            retornar = true;
                            contador = 0;
                            break;
                        }

                    }

                    // Auto-Incremento 
                    for(Obra obra : bd.getObras()){
                        if(obra.getCod_obra() > eMaior) {
                            eMaior = obra.getCod_obra();
                        }
                    }


                    // Se validado cria uma nova Obra e armazela ela ao 'Banco de Dados'
                    if(valido) {
                        Obra obra = new Obra(++eMaior, titulo, autor, ano, 1, tipo_obra, editora);
                        bd.getObras().add(obra);
                        retornar = true;
                    } else {
                        System.out.println("Falha ao criar obra");
                    }

                    clearConsole();
                    break;

                case 2:
                    System.out.println("CADASTRO DE USUARIO");
                    System.out.print("\n\nNome do usuario: ");
                    String nome = leitor.nextLine();

                    System.out.print("Digite o logradouro do usuario: ");
                    String logradouro = leitor.nextLine();

                    System.out.print("Digite o numero: ");
                    int numero = leitor.nextInt();

                    System.out.print("Digite o bairro: ");
                    leitor.nextLine();
                    String bairro = leitor.nextLine();

                    System.out.print("Digite a cidade: ");
                    String cidade = leitor.nextLine();

                    System.out.print("Digite o estado(SP, RJ, etc): ");
                    String estado = leitor.nextLine();

                    eMaior = 0;

                    for(Usuario usuario : bd.getUsuarios()) {
                        if(usuario.getCod_usuario() > eMaior) {
                            eMaior = usuario.getCod_usuario();
                            
                        }
                    }


                    Usuario usuario = new Usuario(++eMaior, nome, logradouro, numero, bairro, cidade, estado);
                    bd.getUsuarios().add(usuario);

                    retornar = true;

                    break;

                case 3:
                    System.out.println("CADASTRAR EDITORA");
                    System.out.print("\nDigite o nome da editora: ");
                    String nome_editora = leitor.nextLine();

                    System.out.print("Digite a cidade da editora: ");
                    String cidade_editora = leitor.nextLine();

                    eMaior = 0;
                    for(Editora editora1 : bd.getEditoras() ) {
                        if(editora1.getCod_editora() > eMaior) {
                            eMaior = editora1.getCod_editora();
                        }
                    }
                    

                    editora = new Editora((eMaior+1), nome_editora, cidade_editora);
                    bd.getEditoras().add(editora);
                    retornar = true;

                    break;

                default:
                    System.out.println("\nFuncionalidade deabilitada no momento...");
                    retornar = true;
                    break;
                
                }
            }
            clearConsole();

            if(retornar) {
                continue;
            }

            if(categoria == 2) {
            boolean encontrado = false;
            switch(Integer.valueOf(opcao)) {
                case 1:
                    while(laco) {
                        System.out.println("BUSCAR OBRA");
                        System.out.println("*Para aparecer todos as obras é so deixar o campo vazio*");
                        System.out.print("Digite o nome da obra: ");
                        String nome_obra = leitor.nextLine().toLowerCase();
                        encontrado = false;

                        for(Obra obra : bd.getObras()) {
                            System.out.println("\n");

                            if(obra.getTitulo().toLowerCase().contains(nome_obra)) {
                                System.out.println(obra.toString());
                                encontrado = true;
                            }
                        }

                        if(encontrado) {
                            System.out.println("Gostaria de fazer outra pesquisa? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                continue;
                            }

                            retornar = true;
                            break;
                        }


                        clearConsole();
                        System.out.println("Nao foi possivel encontrar a obra pesquisada. Tente novamente");

                        if(contador > 0) {
                            System.out.print("Deseja retornar a pagina anterior? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                break;
                            }
                        }
                        continue;
                    }
                    break;

                case 2:
                    while(laco) {
                        System.out.println("BUSCAR USUARIOS");
                        System.out.println("*Para aparecer todos os usuarios é so deixar o campo vazio*");
                        System.out.print("Digite o nome do usuario: ");
                        String nome_usuario = leitor.nextLine().toLowerCase();
                        encontrado = false;

                        for(Usuario usuario : bd.getUsuarios()) {
                            if(usuario.getNome_usuario().toLowerCase().contains(nome_usuario)) {
                                System.out.println(usuario.toString());
                                encontrado = true;
                            }
                        }

                        if(encontrado) {
                            System.out.print("Gostaria de fazer outra pesquisa? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                continue;
                            }

                            retornar = true;
                            break;
                        }


                        clearConsole();
                        System.out.println("Nao foi possivel encontrar a obra pesquisada. Tente novamente");

                        if(contador > 0) {
                            System.out.print("Deseja retornar a pagina anterior? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                break;
                            }
                        }
                        continue;
                    }
                    break;

                case 3:
                    while(laco){
                        System.out.println("BUSCA DE EMPRESTIMOS");
                
                        System.out.println("Deseja realizar a busca por" + "\n1 - Obra " + "\n2 - Usuario." + "\n3 - Listar todos os emprestimos");
                        System.out.print("Digite a opção desejada: ");
                        opcao = leitor.nextLine();

                        System.out.println("\n");


                        switch(Integer.valueOf(opcao)) {
                            case 1:
                                System.out.print("Digite o nome da obra: ");
                                String nome_obra = leitor.nextLine().toLowerCase();

                                for(Emprestimo emprestimo : bd.getEmprestimos()) {
                                    if(emprestimo.getObra().getTitulo().toLowerCase().contains(nome_obra)){
                                        System.out.println(emprestimo.toString());
                                        encontrado = true;
                                    }
                                }

                                break;
                            case 2:
                                System.out.print("Digite o nome do usuario: ");
                                String nome_usuario = leitor.nextLine().toLowerCase();

                                for(Emprestimo emprestimo : bd.getEmprestimos()) {
                                    if(emprestimo.getUsuario().getNome_usuario().toLowerCase().contains(nome_usuario)) {
                                        System.out.println(emprestimo.toString());
                                        encontrado = true;
                                    }
                                }
                                break;
                            case 3:
                                for(Emprestimo emprestimo : bd.getEmprestimos()) {
                                    System.out.println(emprestimo.toString());
                                    encontrado = true;
                                }
                                break;
                            default:
                                System.out.println("Opção "+ opcao +" inválida, digite 1,2 ou 3");
                                clearConsole();
                                continue;
                            
                            }

                            if(encontrado) {
                            System.out.println("Gostaria de fazer outra pesquisa? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                continue;
                            }

                            retornar = true;
                            break;
                        }


                        clearConsole();
                        System.out.println("Nao foi possivel encontrar a obra pesquisada. Tente novamente");

                        contador++;
                        if(contador > 0) {
                            System.out.println("Deseja retornar a pagina anterior? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                break;
                            }
                        }
                        continue;

                        
                    }
                    break;

                case 4:
                    while(laco) {
                        System.out.println("BUSCAR DEVOLUÇÕES");

                        System.out.println("Deseja realizar a busca por" + "\n1 - Obra " + "\n2 - Usuario." + "\n3 - Listar todas as devoluções");
                        System.out.print("Digite a opção desejada: ");
                        opcao = leitor.nextLine();

                        System.out.println("\n");


                        switch(Integer.valueOf(opcao)) {
                            case 1:
                                System.out.print("Digite o nome da obra: ");
                                String nome_obra = leitor.nextLine().toLowerCase();

                                for(Devolucao devolucao : bd.getDevolucoes()) {
                                    if(devolucao.getEmprestimo().getObra().getTitulo().toLowerCase().contains(nome_obra)){
                                        System.out.println(devolucao.toString());
                                        encontrado = true;
                                    }
                                }

                                break;
                            case 2:
                                System.out.print("Digite o nome do usuario: ");
                                String nome_usuario = leitor.nextLine().toLowerCase();

                                for(Devolucao devolucao : bd.getDevolucoes()) {
                                    if(devolucao.getEmprestimo().getUsuario().getNome_usuario().toLowerCase().contains(nome_usuario)) {
                                        System.out.println(devolucao.toString());
                                        encontrado = true;
                                    }
                                }
                                break; 
                            case 3:
                                for(Devolucao devolucao : bd.getDevolucoes()) {
                                    System.out.println(devolucao.toString());
                                    encontrado = true;
                                }
                                break;
                            default:
                                System.out.println("Opção "+ opcao +" inválida, digite 1,2 ou 3");
                                clearConsole();
                                continue;
                            
                            }

                            if(encontrado) {
                            System.out.println("Gostaria de fazer outra pesquisa? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                encontrado = false;
                                continue;

                            }

                            retornar = true;
                            break;
                        }


                        clearConsole();
                        System.out.println("Nao foi possivel encontrar a obra pesquisada. Tente novamente");


                        contador++;
                        if(contador > 0) {
                            System.out.println("Deseja retornar a pagina anterior? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                break;
                            }
                        }
                        continue;

                        
                    }
                    break;

                case 5:
                    while(laco) {
                        System.out.println("BUSCAR EDITORAS");
                        System.out.println("*Para aparecer todos os usuarios é so deixar o campo vazio*");
                        System.out.print("Digite o nome da Editora: ");
                        String nome_editora = leitor.nextLine().toLowerCase();

                        for(Editora editora : bd.getEditoras()) {
                            if(editora.getNome_editora().toLowerCase().contains(nome_editora)) {
                                System.out.println(editora.toString());
                                encontrado = true;
                            }
                        }

                        if(encontrado) {
                            System.out.println("Gostaria de fazer outra pesquisa? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                encontrado = false;
                                continue;

                            }

                            retornar = true;
                            break;
                        }


                        clearConsole();
                        System.out.println("Nao foi possivel encontrar a obra pesquisada. Tente novamente");


                        contador++;
                        if(contador > 0) {
                            System.out.println("Deseja retornar a pagina anterior? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                break;
                            }
                        }
                        continue;
                    }

                    break;

                case 6:
                    while(laco) {
                        System.out.println("BUSCAR FUNCIONARIOS");
                        System.out.println("*Para aparecer todos os usuarios é so deixar o campo vazio*");
                        System.out.print("Digite o nome do funcionario: ");
                        String nome_funcionario = leitor.nextLine().toLowerCase();

                        for(Funcionario funcionario : bd.getFuncionarios()) {
                            if(funcionario.getNome_funcionario().toLowerCase().contains(nome_funcionario)) {
                                System.out.println(funcionario.toString());
                                encontrado = true;
                            }
                        }

                        if(encontrado) {
                            System.out.println("Gostaria de fazer outra pesquisa? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                encontrado = false;
                                continue;

                            }

                            retornar = true;
                            break;
                        }


                        clearConsole();
                        System.out.println("Nao foi possivel encontrar a obra pesquisada. Tente novamente");


                        contador++;
                        if(contador > 0) {
                            System.out.println("Deseja retornar a pagina anterior? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                break;
                            }
                        }
                        continue;
                    }

                    break;

                case 7:
                    while(laco) {
                        System.out.println("BUSCAR DEPARTAMENTO");
                        System.out.println("*Para aparecer todos os usuarios é so deixar o campo vazio*");
                        System.out.print("Digite o nome do departamento: ");
                        String nome_depto = leitor.nextLine().toLowerCase();

                        for(Departamento depto : bd.getDepartamentos()) {
                            if(depto.getNome_departamento().toLowerCase().contains(nome_depto)) {
                                System.out.println(depto.toString());
                                encontrado = true;
                            }
                        }

                        if(encontrado) {
                            System.out.println("Gostaria de fazer outra pesquisa? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                encontrado = false;
                                continue;

                            }

                            retornar = true;
                            break;
                        }


                        clearConsole();
                        System.out.println("Nao foi possivel encontrar a obra pesquisada. Tente novamente");


                        contador++;
                        if(contador > 0) {
                            System.out.println("Deseja retornar a pagina anterior? [S/N]");
                            opcao = leitor.nextLine().toUpperCase();
                            if(opcao.equals("S")) {
                                retornar = true;
                                break;
                            }
                        }
                        continue;
                    }
                    break;
                }

            }

            clearConsole();

            if(retornar) {
                continue;
            }

        }


    }


    // Pula algumas linhas no console
    public final static void clearConsole()
    {

        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }



    private static boolean esqueceuCodigo(int contador) {
        Scanner leitor = new Scanner(System.in);

        if(contador > 1) {
            System.out.print("Se não lembra o código. Deseja retornar ao menu e realizar uma pesquisa? [S/N]");
            String opcao = leitor.nextLine().toUpperCase();
            if(opcao.equals("S")) {
                contador = 0;
                return true;
                
            }
         
        }

        return false;
    }




    // Populando o Banco de Dados, ele se resume em uma Class com List de cada Class relevante criada, Ex: List<Funcionario>
    private static BancoDeDados gerarDados() {
        BancoDeDados bd = new BancoDeDados();

        
        Usuario user1 = new Usuario(100000290,	"Joaquim da Silva",	"Rua da Mata",	23, "Mooca","Sao Paulo","SP");

        user1.setCpf("5252862842");
        user1.setEnd_complemento("11A");
        user1.setEnd_cep("4363000");
        user1.setTelefone("982752241");

        Usuario user2 = new Usuario(100000291, "Joao Pedro", "Rua do fico",	34,	"Bras", "Sao Paulo", "SP");

        user2.setCpf("5252862843");
        user2.setEnd_cep("2546820");
        user2.setTelefone("982752241");

        Usuario user3 = new Usuario(100000292,	"Francsico Matins",	"Av. 23 de maio",	564,	"Itaim", 	"Sao Paulo",	"SP");


        Usuario user4 = new Usuario(100000293,	"Jose da Silva",	"Av. 7 de Abril",	342,		"Moema",	"Sao Paulo",	"SP");

        user4.setEnd_cep("2546820");
        user4.setCpf("5252862845");

        
        
        

        Departamento depto1 = new Departamento(1,	"Adm");
        Departamento depto2 = new Departamento(2,	"RH");
        Departamento depto3 = new Departamento(3,	"Eng");
        Departamento depto4 = new Departamento(4,	"Exp");
        Departamento depto5 = new Departamento(5,	"Estoque");
        Departamento depto6 = new Departamento(6,	"Ger");
        Departamento depto7 = new Departamento(7,	"Dir");



        Funcionario func1 = new Funcionario(101990,	"Erica",	depto1);
        Funcionario func2 = new Funcionario(101991,	"Maria",	depto2);
        Funcionario func3 = new Funcionario(101992,	"Nair",	depto2);
        Funcionario func4 = new Funcionario(101993,	"Jose",	depto7);
        Funcionario func5 = new Funcionario(101994,	"Paulo",	depto4);
        Funcionario func6 = new Funcionario(101995,	"Francisco",	depto3);
        Funcionario func7 = new Funcionario(101996,	"Bruno",	depto6);
        Funcionario func8 = new Funcionario(101997,	"Carlos",	depto1);
        Funcionario func9 = new Funcionario(101998,	"Cicero",	depto6);
        Funcionario func10 = new Funcionario(101999,	"Neuma",	depto3);
        Funcionario func11 = new Funcionario(102000,	"Marisa",	depto4);
        Funcionario func12 = new Funcionario(102001,	"Aparecida",	depto2);
        Funcionario func13 = new Funcionario(102002,	"Rogerio",	depto5);
        
        
        




        Editora editora1 = new Editora(101,	"Erica",	"São Paulo");
        Editora editora2 = new Editora(102,	"Texto",	"Salvador");
        Editora editora3 = new Editora(103,	"Mark",	"São Paulo");
        Editora editora4 = new Editora(104,	"Triangulo",	"Porto Alegre");
        Editora editora5 = new Editora(105,	"Quadrado",	"Porto Alegre");
        Editora editora6 = new Editora(106,	"Circular",	"Porto Alegre");
        Editora editora7 = new Editora(107,	"Esferico",	"São Paulo");
        Editora editora8 = new Editora(108,	"Universidade",	"Rio de Janeiro");
        Editora editora9 = new Editora(109,	"Campus",	"Salvador");
        Editora editora10 = new Editora(110,	"New York",	"Porto Alegre");






        Obra obra1 = new Obra(1,	"História do Brasil", "Rogerio Alencar",	2010, 1,	"ficção",	editora1);
        Obra obra2 = new Obra(2,	"Geografia", "Roberto Marinho",	2011, 1,	"Terror",	editora2);
        Obra obra3 = new Obra(3,	"Matematica", "Pablo Escobar",	2012, 1,	"ficção",	editora3);
        Obra obra4 = new Obra(4,	"Fisica", "Fernando de Noronha",	2013, 1,	"Terror",	editora4);
        Obra obra5 = new Obra(5,	"Quimica", "Renato Pereira",	2014, 1,	"ficção",	editora5);
        Obra obra6 = new Obra(6,	"Filosofia", "Sergio Cortela",	2015, 1,	"Terror",	editora6);
        Obra obra7 = new Obra(7,	"Teologia",	"Padre Rossi", 2016, 1,	"ficção",	editora7);
        Obra obra8 = new Obra(8,	"Portugues", "Joaquim Paes",	2017, 1,	"Terror",	editora8);
        Obra obra9 = new Obra(9,	"Literatura", "Stalin",	2018, 1,	"ficção",	editora9);
        Obra obra10 = new Obra(10,	"Engenharia 1",	"Paulo Renato", 2019, 1,	"Terror",	editora10);
        Obra obra11 = new Obra(11,	"Engenharia 2",	"Jair Silva", 2020, 1,	"ficção",	editora1);


        Emprestimo emprestimo1 = new Emprestimo(323231, obra11, user4, func13);

        Emprestimo emprestimo2 = new Emprestimo(323232, obra10, user4, func13);

        Devolucao devolucao1 = new Devolucao(emprestimo2, func13);



        bd.getUsuarios().add(user1);
        bd.getUsuarios().add(user2);
        bd.getUsuarios().add(user3);
        bd.getUsuarios().add(user4);

        bd.getDepartamentos().add(depto1);
        bd.getDepartamentos().add(depto2);
        bd.getDepartamentos().add(depto3);
        bd.getDepartamentos().add(depto4);
        bd.getDepartamentos().add(depto5);
        bd.getDepartamentos().add(depto6);
        bd.getDepartamentos().add(depto7);


        bd.getFuncionarios().add(func1);
        bd.getFuncionarios().add(func2);
        bd.getFuncionarios().add(func3);
        bd.getFuncionarios().add(func4);
        bd.getFuncionarios().add(func5);
        bd.getFuncionarios().add(func6);
        bd.getFuncionarios().add(func7);
        bd.getFuncionarios().add(func8);
        bd.getFuncionarios().add(func9);
        bd.getFuncionarios().add(func10);
        bd.getFuncionarios().add(func11);
        bd.getFuncionarios().add(func12);
        bd.getFuncionarios().add(func13);


        bd.getEditoras().add(editora1);
        bd.getEditoras().add(editora2);
        bd.getEditoras().add(editora3);
        bd.getEditoras().add(editora4);
        bd.getEditoras().add(editora5);
        bd.getEditoras().add(editora6);
        bd.getEditoras().add(editora7);
        bd.getEditoras().add(editora8);
        bd.getEditoras().add(editora9);
        bd.getEditoras().add(editora10);


        bd.getObras().add(obra1);
        bd.getObras().add(obra2);
        bd.getObras().add(obra3);
        bd.getObras().add(obra4);
        bd.getObras().add(obra5);
        bd.getObras().add(obra6);
        bd.getObras().add(obra7);
        bd.getObras().add(obra8);
        bd.getObras().add(obra9);
        bd.getObras().add(obra10);
        bd.getObras().add(obra11);

        bd.getEmprestimos().add(emprestimo1);
        bd.getEmprestimos().add(emprestimo2);

        bd.getDevolucoes().add(devolucao1);


        // Adiciona ao departamento todos os funcionarios que nele trabalham atravé de uma List<>, pertecente a Class Departamento

        for(Departamento departamento : bd.getDepartamentos()) {
            for(Funcionario funcionario : bd.getFuncionarios()){
                if(departamento.getCod_departamento() == funcionario.getDepartamento().getCod_departamento()) {
                    departamento.getFuncionarios().add(funcionario);
                }
            }
        }

        return bd;
    }
}
