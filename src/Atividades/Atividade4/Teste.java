package Atividades.Atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Atividades.Atividade4.pacote.ValidaCpf;
import Atividades.Atividade4.pacote.ValidaNome;
import Atividades.Atividade4.pacote.ValidaRg;


public class Teste {

    List<ClienteWhile> clientes = new ArrayList<>();
    private Scanner leitor;
    private static Scanner leitor2;
    private void cadastrarClientes(){

        String CPF;
        String NOME;
        String RG;
        boolean isOk = true;

        leitor = new Scanner(System.in);
        ClienteWhile cliente = new ClienteWhile();

        do {
            System.out.print("Nome do cliente: ");
            NOME = leitor.nextLine();
            if (ValidaNome.isNome(NOME) == true){
                cliente.setNomeCliente(NOME);
                break;
            } else{ System.out.printf("Erro, nome deve conter no mínimo 3 caracteres !!!\n");};
        }while (isOk);

        System.out.print("Sobrenome do cliente: ");
        cliente.setSobrenomeCliente(leitor.nextLine());

        do {
            System.out.print("Cpf do cliente: ");
            CPF = leitor.nextLine();
            if (ValidaCpf.isCPF(CPF) == true){
                cliente.setCpf(CPF);
                break;
            } else{ System.out.printf("Erro, CPF invalido !!!\n");};
        }while (isOk);

        do{
            System.out.print("RG do cliente: ");
            RG = leitor.nextLine();
            if (ValidaRg.isRg(RG) == true){
                cliente.setRg(RG);
                break;
            } else{ System.out.printf("Erro, DIGITE NO MÍNIMO 4 E NO MAXÍMO 11 CARACTERES !!!\n");};
        }while (isOk);

        leitor.nextLine();// limpa o scanner
        clientes.add(cliente);
    }

    private void imprimirClientes() {
        for(ClienteWhile cliente : clientes){
            System.out.println("Lista de clientes cadastrados: ");
            System.out.println("Nome        : " + cliente.getNomeCliente().toUpperCase());
            System.out.println("Sobrenome   : " + cliente.getSobrenomeCliente().toUpperCase());
            System.out.println("Cpf         : " + ValidaCpf.maskCPF(cliente.getCpf()));
            System.out.println("Rg          : " + cliente.getRg());
            System.out.println("\n\n");
        }
    }

    public static void main(String[] args){
        short opcao = 3;
        leitor2 = new Scanner(System.in);
        Atividades.Atividade4.Teste teste = new Atividades.Atividade4.Teste();

        do{
            teste.exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = leitor2.nextShort();

            switch(opcao){
                case 1:
                    teste.cadastrarClientes();
                    System.out.println("Produto Cadastrado com sucesso");
                    break;
                case 2:
                    teste.imprimirClientes();
                    break;
                case 3:
                    teste.exibirMenu();
                    break;
            }
        }while(opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("+------------------Bem Vindo----------------+");
        System.out.println("+-------------------------------------------+");
        System.out.println("|        Cadastro de produtos               |");
        System.out.println("|          Escolha uma opção:               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Cadastrar Cliente                     |");
        System.out.println("| 2 - Imprimir relatório de clientes        |");
        System.out.println("| 3 - Exibir o menu de opções               |");
        System.out.println("| 0 - Sair                                  |");
        System.out.println("+-------------------------------------------+");
    }

}
