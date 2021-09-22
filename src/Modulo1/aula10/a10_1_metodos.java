package Modulo1.aula10;

import java.util.Scanner;

public class a10_1_metodos {

    public static void main(String[] args) {
        double num1, num2;
        num1 = ler_numero();
        num2 = ler_numero();
    }
    static double ler_numero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = Double.parseDouble(sc.nextLine());
        return numero;
    }
}