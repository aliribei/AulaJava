package Atividades.Atividade5;
import java.util.Scanner;

public class AtividadeFor {
    private static Scanner reader;

    public static void main(String[] args) {

        reader = new Scanner(System.in);
        String nome;
        String sobrenome;


        for (int indice = 0; indice < 5; indice++) {
            System.out.println("Informe o nome: ");
            nome = reader.nextLine();
            System.out.println("Informe o sobrenome");
            sobrenome = reader.nextLine();
            System.out.printf("%d Usuario cadastrado com sucessos!\n Nome:  %s %s!\n", indice +1, nome,sobrenome);
        }
    }
}
