package Revisao.modulo1;

public class a8 {
    
    public static void main(String[] args) {

        byte idade = 18;

        if ( idade  >= 18) {
            System.out.println("Pode dirigir");
        }else {
            System.out.println("Não pode dirigir");
        }

        System.out.println((idade  >=18) ? "Pode dirigir" : "Não pode dirigir");

        if (idade > 18) {
            System.out.println("Passou da idade");
        }
        else if (idade == 18) {
            System.out.println("Alistamento");
        }else {
            System.out.println("Abaixo da idade");
        }

    }
}
