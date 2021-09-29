package Modulo1.aula1;
import java.util.Scanner;
public class a1_2_calculadora {
    private static Scanner scanner;

    public static void main(String arg[]){
        scanner = new Scanner(System.in);

        int n1,n2;
        System.out.print("Digite o primeiro numero: ");
        n1=scanner.nextInt();
        System.out.print("Digite o primeiro numero: ");
        n2=scanner.nextInt();

        System.out.println("A soma de "+n1+" + "+n2+" = "+(n1+n2));
        System.out.println("A soma de n1 e n2 é n1+n2");
    }
}
