package Atividades.Atividade7;

import java.util.Scanner;

public class Main {
    Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {

        boolean valida = false;
        do {
            double num1 =  ler_numero("Digite um número:");
            double num2 =  ler_numero("Digite outro número:");
            if(num1 > 0 && num2 > 0){
                double res1  = somar(num1, num2);
                double res2  = subtrair(num1, num2);
                double res3  = dividir(num1, num2);
                double res4  = multiplicar(num1, num2);
                System.out.println(res1 + "\n" +res2 + "\n" +res3 + "\n" +res4 + "\n");
            }else {
                System.out.println("Número tem que ser maior que 0!");
                valida = false;
            }
        }while (valida);
    }

    static double somar (double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }

    static double subtrair (double num1, double num2){
        double resultado =  num1 - num2;
        return resultado;
    }

    static double dividir (double num1, double num2){
        double resultado = num1 / num2;
        return  resultado;
    }

    static double multiplicar (double num1, double num2){
        double resultado = num1 * num2;
        return  resultado;
    }
    static double ler_numero(String mensagem){
        Scanner leitor = new Scanner(System.in);
        System.out.print(mensagem);
        double numero = Integer.parseInt(leitor.nextLine());
        return numero;
    }
}