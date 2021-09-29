package Modulo1.aula5;

import java.util.Scanner;

public class a5_1_while {


    private static Scanner reader;

    public static void main(String[] args) {
        reader = new Scanner(System.in);
        boolean invalido = true;

        do {
            System.out.println("Digite o nome do produto: ");
            String nome = reader.nextLine();
            if (nome.length() < 5) {
                System.out.println("O nome deve ter mais do que 5 caracteres");
                System.out.println("Digite o nome novamente.");
                nome = reader.nextLine();
            }
            else {
                invalido = false;
            }
        }while (invalido);
    }
}
