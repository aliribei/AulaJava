package Atividades.Atividades6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String nome;
        String sobrenome;
        System.out.println("Informe o nome: ");
        nome = reader.nextLine();
        System.out.println("Informe o sobrenome");
        sobrenome = reader.nextLine();

        System.out.println("++++++++++++++++ For +++++++++++++++++");
        for (int indice = 0; indice <= 9;) {

            System.out.printf("%d Usuario cadastrado com sucessos!\n Nome:  %s %s!\n", indice +1, nome,sobrenome);
            indice++;
        }


        int contador = 0;
        System.out.println("++++++++++++++++ While +++++++++++++++++");

        while( contador <= 9 ){
            System.out.println(nome + " " + sobrenome);
            System.out.printf("%d Usuario cadastrado com sucessos!\n Nome:  %s %s!\n", contador + 1, nome, sobrenome);
            contador++;
        }
    }
}
