package Revisao.modulo1;

import java.util.Scanner;

// Ler um valor N. Calcular e escrever seu respectivo 
// fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1.


//fatorial de 3 = 3*2*1=6
//fatorial de 5 = 5*4*3*2*1=120

public class a15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = Integer.parseInt(sc.nextLine());

        int fatorial = 1;

        for( int i = num; i > 0; i--){
            System.out.printf("%d* ",i);
            fatorial = fatorial * i;
        }

        System.out.printf("= %d", fatorial);
        sc.close();
    }
}
