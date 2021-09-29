package modulo1;

import java.util.Scanner;

public class a11 {

     private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        byte idade = 0;
        boolean invalido = false;
        do{
            System.out.print("Digite sua idade: ");
            idade = Byte.parseByte(sc.nextLine());
            if(idade < 0){
                System.out.println("Idade nao pode ser negativa!");
                invalido =true;
            }
        }while(invalido);

        System.out.println("========== Obrigado ===========");
    }
    
}
