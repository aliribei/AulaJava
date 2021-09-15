package Atividades.Atividade4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Atividades.Atividade4.pacote.ValidaCpf;



public class Teste {

    List<ClienteWhile> clientes = new ArrayList<>();
    private void cadastrarClientes(){

        String CPF;

        Scanner leitor = new Scanner(System.in);
        ClienteWhile cliente = new ClienteWhile();

        System.out.print("Nome do cliente: ");
        cliente.setNomeCliente(leitor.nextLine());

        System.out.print("Sobrenome do cliente: ");
        cliente.setSobrenomeCliente(leitor.nextLine());

        System.out.print("Cpf do cliente: ");
        CPF = leitor.nextLine();
        if (ValidaCpf.isCPF(CPF) == true){
            cliente.setCpf(CPF);
        } else{ System.out.printf("Erro, CPF invalido !!!\n");};

        leitor.nextLine();// limpa o scanner
        clientes.add(cliente);
    }

    private void imprimirClientes() {
        for(ClienteWhile cliente : clientes){
            System.out.println("Lista de clientes cadastrados: ");
            System.out.println("Nome:   " + cliente.getNomeCliente().toUpperCase());
            System.out.println("Sobrenome:   " + cliente.getSobrenomeCliente().toUpperCase());
            System.out.println("Cpf: " + cliente.getCpf());
            System.out.println("Rg: " + cliente.getRg());
            System.out.println("\n\n");
        }
    }

    public static void main(String[] args){
        short opcao = 3;
        Scanner leitor = new Scanner(System.in);
        Atividades.Atividade4.Teste teste = new Atividades.Atividade4.Teste();

        do{
            teste.exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = leitor.nextShort();

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
