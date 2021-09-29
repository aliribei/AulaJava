package Atividades.Atividade2;
import java.util.Scanner;

public class CadastroCliente {

    private static Scanner sc;

    public static void main(String args[]) {

        sc = new Scanner(System.in);

        System.out.println("+-------------------------------------------+");
        System.out.println("+------------------Bem Vindo----------------+");
        System.out.println("+-------------------------------------------+");
        System.out.println("|           Cadastro de Clientes            |");
        System.out.println("+-------------------------------------------+");

        System.out.println("Didite o nome: ");
        String nome1 = sc.next();

        System.out.println("Digite o sobrenome: ");
        String nome2 = sc.next();

        System.out.println("Digite a idade:  ");
        int idade = sc.nextInt();

        if (idade<18){
            System.out.println("Não permitido o cadastro de clientes com idade inferior à 18 anos");
        } else {
            System.out.println("Cliente cadastrado com sucesso");
            System.out.println("Nome:   " + nome1);
            System.out.println("Sobrenome:   " + nome2);
            System.out.println("Idade:   " + idade);
        }
    }
}
