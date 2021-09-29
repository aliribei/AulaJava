package Modulo1.aula1;
import java.util.Scanner;
public class a1_1_console {
    private static Scanner scanner;

    public static void main(String arg[]){
        scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome=scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome=scanner.next();

        System.out.print("Digite sua idade: ");
        int idade=scanner.nextInt();

        System.out.println(nome+" "+sobrenome+" | Idade: "+idade);
    }
}
