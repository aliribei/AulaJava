package Atividades.Atividade7;

import java.util.Scanner;

public class Main {
    private static Scanner leitor;
    public static void main(String[] args) {
        cabecalho();
        do {
            double num1 =  ler_numero("Digite um número:");
            double num2 =  ler_numero("Digite outro número:");
            if(num1 > 0 && num2 > 0){
                double res1  = somar(num1, num2);
                double res2  = subtrair(num1, num2);
                double res3  = dividir(num1, num2);
                double res4  = multiplicar(num1, num2);

                System.out.println("-----Resultados:-----");
                System.out.printf("Soma: %.2f\n",res1);
                System.out.printf("Subtração: %.2f\n",res2);
                System.out.printf("Divisão: %.2f\n",res3);
                System.out.printf("Multiplicação: %.2f\n",res4);
                System.out.println("-------------------------------");
                System.out.print("Resultados: "+
                        "\nSoma: " + res1 +
                        "\nSubtração: " + res2 +
                        "\nDivisão: " + res3 +
                        "\nMultiplicação: " + res4);
                break;
            }else {
                System.out.println("Número tem que ser maior que 0!");
            }
        }while (true);
    }

    static void cabecalho(){
        System.out.println("======= Calculadora =========\n");
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
        leitor = new Scanner(System.in);
        System.out.print(mensagem);
        double numero = Double.parseDouble(leitor.nextLine());
        return numero;
    }
}