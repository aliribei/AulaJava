package Atividades.Atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    List<Cliente> clientes = new ArrayList<>();
    private Scanner leitor;
    private static Scanner leitor2;

    private void cadastrarClientes(){
        leitor = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.print("Nome do cliente: ");
        cliente.setNomeCliente(leitor.nextLine());

        System.out.print("Sobrenome do cliente: ");
        cliente.setSobrenomeCliente(leitor.nextLine());

        System.out.print("Idade do cliente: ");
        cliente.setIdade(leitor.nextInt());

        leitor.nextLine();// limpa o scanner
        clientes.add(cliente);
    }

    private void imprimirClientes() {
        for(Cliente cliente : clientes){
            System.out.println("Lista de clientes cadastrados: ");
            System.out.println("Nome:   " + cliente.getNomeCliente().toUpperCase());
            System.out.println("Nome:   " + cliente.getSobrenomeCliente().toUpperCase());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("\n\n");
        }
    }

    public static void main(String[] args){
        short opcao = 3;
        leitor2 = new Scanner(System.in);
        Atividades.Atividade2.Teste teste = new Atividades.Atividade2.Teste();

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
