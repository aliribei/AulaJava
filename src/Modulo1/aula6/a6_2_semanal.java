package Modulo1.aula6;
import java.util.Scanner;

public class a6_2_semanal {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        int contador = 0;
        while (contador < 5) {
            System.out.println(contador);
            contador++;
        }
        System.out.printf("O valor final: %d", contador);
        System.out.println();
        System.out.println("==========================");

        int num = 1;
        while (num <=10) {
            int mult = 0;
            while (mult <= 10) {
                System.out.println(num * mult);
                mult++;
            }
            System.out.println();
            num++;
        }

        System.out.println("==========================");
        int numero2 = 0;
        do {
            System.out.println(numero2);
            numero2++;
        }while(numero2 < 5);

        int numeroDias = 5;
                System.out.println((numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");

        int estoque = 30;//valor recuperado do sistema

        if (estoque >= 100) {
            System.out.println("Produto com quantidade suficiente.");
        } else if (estoque < 100 && estoque > 50) {
            System.out.println("Alerta: Avaliar possibilidade de novo pedido. Estoque: "+ estoque);
        } else {
            System.out.println("ATENÇÃO! Faça um novo pedido. Estoque: "+ estoque);
        }
    }
}
