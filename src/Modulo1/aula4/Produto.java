package Modulo1.aula4;

import java.util.Scanner;

public class Produto {
    private static Scanner sc;

    public static  void main(String[] args) {
        setSc(new Scanner(System.in));

        System.out.println("==========Cadastro de produtos ============");

    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Produto.sc = sc;
    }
}
