package Modulo1.aula6;

import java.util.Scanner;

public class a6_1_atividadepratica5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("----------------- CadDev - Ambiente de Cadastro -------------------");
        System.out.println("-----------------------  Seja bem-vindo(a)!  ----------------------");
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Menu de opções: ");
        System.out.println("\t 1 - Cadastar desenvolvedor");
        System.out.println("\t 2 - Cadastrar linguagem de programação");
        System.out.println("\t 0 - Sair");
        System.out.println("Escolha uma opção no menu:");
        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Opção escolhida: Cadastrar desenvolvedor");
                System.out.println("Digite o nome do desenvolvedor: ");
                String nomeDesenvolvedor = sc.nextLine();
                do {

                    if (nomeDesenvolvedor.length() < 3) {
                        System.out.println("O nome do desenvolvedor deverá ter mais que 3 caracteres.");
                        System.out.println("Digite novamente o nome do desenvolvedor: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                invalido = true;
                System.out.println("Digite o sobrenome do desenvolvedor: ");
                String sobrenomeDesenvolvedor = sc.nextLine();
                do {
                    if (sobrenomeDesenvolvedor.length() < 3) {
                        System.out.println("O sobrenome do desenvolvedor deverá ter mais que 3 caracteres.");
                        System.out.println("Digite novamente o sobrenome do desenvolvedor: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                invalido = true;
                System.out.println("Informe o nível de senioridade do desenvolvedor: ");
                String senioridadeDesenvolvedor = sc.nextLine();
                do {
                    invalido = false;
                } while (invalido);
                invalido = true;
                System.out.println("Digite a idade do desenvolvedor: ");
                int idadeDesenvolvedor = sc.nextInt();
                do {
                    if (idadeDesenvolvedor <= 0) {
                        System.out.println("A idade informada não é válida!");
                        System.out.println("Digite novamente a idade do desenvolvedor: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                System.out.println("Cadastro de desenvolvedor realizado com sucesso!");
                System.out.println("Resumo dos dados inseridos do desenvolvedor: ");
                System.out.printf("Nome: %s.", nomeDesenvolvedor);
                System.out.printf("Sobrenome: %s.", sobrenomeDesenvolvedor);
                System.out.printf("Senioridade: %s.", senioridadeDesenvolvedor);
                System.out.printf("Idade: %d anos.", idadeDesenvolvedor);
                break;

            case 2:
                System.out.println("Opção escolhida: Cadastrar linguagem de programação");
                System.out.println("Informe a linguagem de programação: ");
                String linguagemProgramacao = sc.nextLine();
                do {
                    if (linguagemProgramacao.length() < 3) {
                        System.out.println("O nome da linguagem de programação deverá ter mais que 3 caracteres.");
                        System.out.println("Digite novamente a linguagem de programação: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);
                invalido = true;
                System.out.println("Informe a descrição da linguagem de programação: ");
                String descricaoLinguagem = sc.nextLine();
                do {
                    invalido = false;
                } while (invalido);
                invalido = true;

                System.out.println("Menu de opções de aplicações da linguagem informada: ");
                System.out.println("\t 1 - Front-end");
                System.out.println("\t 2 - Back-end");
                System.out.println("\t 3 - Mobile");
                System.out.println("Digite a opção escolhida no menu:");
                int aplicacaoLinguagem = sc.nextInt();

                while (invalido){
                    if (aplicacaoLinguagem == 1) {
                        System.out.println("Você escolheu a opção front-End!");
                        invalido = false;
                    }
                    else if (aplicacaoLinguagem == 2) {
                        System.out.println("Você escolheu a opção back-end!");
                        invalido = false;
                    }
                    else if (aplicacaoLinguagem == 3) {
                        System.out.println("Você escolheu a opção mobile!");
                        invalido = false;
                    }
                    else {
                        System.out.println("Escolha uma opção do menu, por favor.\n Digite novamente a opção escolhida: ");
                        aplicacaoLinguagem = sc.nextInt();
                        sc.nextLine();
                    }
                }
                System.out.println("Cadastro de linguagem de programação realizado com sucesso!");
                System.out.println("Resumo dos dados inseridos sobre a linguagem de programação: ");
                System.out.printf("Linguagem de programação: %s.", linguagemProgramacao);
                System.out.printf("Descrição: %s.", descricaoLinguagem);
                System.out.printf("Aplicação: %s.", aplicacaoLinguagem);
                break;

            case 0:
                System.out.println("Saindo...");
                break;
        }
    }
}
