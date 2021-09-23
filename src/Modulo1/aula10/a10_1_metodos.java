package Modulo1.aula10;
import java.util.Scanner;

public class a10_1_metodos {

    public static void main(String[] args) {
        double num1, num2;
        num1 = ler_numero();
        num2 = ler_numero();
        double res_soma = somar(num1, num2);
        double res_subtracao = subtrair(num1, num2);
        double res_multiplicacao = multiplicar(num1, num2);
        double res_divisao = dividir(num1, num2);

        imprimir_resultado("soma", res_soma);
        imprimir_resultado("subtração", res_subtracao);
        imprimir_resultado("multiplicação", res_multiplicacao);
        imprimir_resultado("divisão", res_divisao);
        System.out.println("\n======================================");
        System.out.printf("\nO resultado da soma é %.2f", res_soma);
        System.out.printf("\nO resultado da subtração é %.2f", res_subtracao);
        System.out.printf("\nO resultado da multiplicação é %.2f", res_multiplicacao);
        System.out.printf("\nO resultado da divisão é %.2f", res_divisao);
    }

    static  void imprimir_resultado (String nome_operacao, double resultado){
        System.out.printf("\nO resultado da %s é %.2f", nome_operacao, resultado);
    }
    static double ler_numero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = Double.parseDouble(sc.nextLine());
        return numero;
    }

    static  double somar (double num1, double num2){
        double resultado = num1 + num2;
        return resultado;
    }

    static  double subtrair (double num1, double num2){
        double resultado = num1 - num2;
        return resultado;
    }

    static  double multiplicar (double num1, double num2){
        double resultado = num1 * num2;
        return resultado;
    }

    static  double dividir (double num1, double num2){
        double resultado = num1 / num2;
        return resultado;
    }
    static boolean isValidaNumber(Double number){
        boolean valido = true;
        if(number <= 0 ){
            valido = false;
        }
        return valido;
    }
}