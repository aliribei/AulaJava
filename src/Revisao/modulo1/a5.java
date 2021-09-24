package modulo1;

import java.util.Scanner;

public class a5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite algo");
        String linha = sc.nextLine();
        System.out.println("Foi lido: " + linha);

        
        System.out.println("Digite algo");
        String linha2 = sc.nextLine();
        System.out.println("Foi lido: " + linha2);

        System.out.println("Digite algo");
        String linha3 = sc.nextLine();
        System.out.println("Foi lido: " + linha3);

       //System.out.println("Digite um numero");
        //int linha4 = sc.nextInt();
       // System.out.println("Foi lido: " + linha4);

        System.out.println("Digite um numero Int");
        int linha5 = Integer.parseInt(sc.nextLine());
        System.out.println("Foi lido: " + linha5);

        
        System.out.println("Digite um numero Double");
        double linha6 = Double.parseDouble(sc.nextLine());
        System.out.println("Foi lido: " + linha6);

        System.out.println("Digite um numero Double");
        float linha7 = Float.parseFloat(sc.nextLine());
        System.out.println("Foi lido: " + linha7);

        System.out.println("Digite um numero Double");
        long linha8 = Long.parseLong(sc.nextLine());
        System.out.println("Foi lido: " + linha8);

    }
    
}
