package Atividades.Atividade3;

import Atividades.Atividade2.Cliente;

import java.util.Scanner;

public class MovieList {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("***************************************************");
        System.out.println("*****************    MoviesList    *****************");
        System.out.println("***************************************************");

        System.out.println("****************  Escolha uma opção:  *************");
        System.out.println("1 - Filmes");
        System.out.println("2 - Séries");
        System.out.println("3 - Documentários");
        System.out.println("0 - Para sair");

        System.out.println("\nDigite o número da opção escolhida: ");
        int option = leitor.nextInt();
        leitor.nextLine();

        switch (option) {
            case 1:
                System.out.println(" ****** Filme ******");

                System.out.println("Digite o nome do filme: ");
                String movieName = leitor.nextLine();

                System.out.println("Digite a descrição: ");
                String movieDescription = leitor.nextLine();

                System.out.println("Digite o gênero: ");
                String movieGenre = leitor.nextLine();

                System.out.println("Digite o ano de lançamento: ");
                int movieYear = leitor.nextInt();
                break;

            case 2:
                System.out.println(" ****** Série ******");

                System.out.println("Digite o nome: ");
                String seriesName = leitor.nextLine();

                System.out.println("Digite o ano de lançamento: ");
                int seriesYear = leitor.nextInt();

                System.out.println("Digite a produtora: ");
                String seriesProducer = leitor.nextLine();
                break;

            case 3:

                System.out.println(" ****** Documentário ******");

                System.out.println("Digite o nome: ");
                String documentaryName = leitor.nextLine();

                System.out.println("Digite o ano de lançamento: ");
                int documentaryYear = leitor.nextInt();

                System.out.println("Digite a produtora: ");
                String documentaryProducer = leitor.nextLine();
                break;
            case 0:
                System.out.println("Fim do programa");
                System.out.println("=================================================");
                break;
        }
    }
}
