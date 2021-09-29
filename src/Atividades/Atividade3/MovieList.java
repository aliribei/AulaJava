package Atividades.Atividade3;

import java.util.Scanner;

public class MovieList {

    private static Scanner leitor;
    private static String movieName;
    private static String movieDescription;
    private static String movieGenre;
    private static int movieYear;
    private static String seriesName;
    private static int seriesYear;
    private static String seriesProducer;
    private static String documentaryName;
    private static int documentaryYear;
    private static String documentaryProducer;

    public static void main(String[] args) {
        leitor = new Scanner(System.in);

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
                setMovieName(leitor.nextLine());

                System.out.println("Digite a descrição: ");
                setMovieDescription(leitor.nextLine());

                System.out.println("Digite o gênero: ");
                setMovieGenre(leitor.nextLine());

                System.out.println("Digite o ano de lançamento: ");
                setMovieYear(leitor.nextInt());
                break;

            case 2:
                System.out.println(" ****** Série ******");

                System.out.println("Digite o nome: ");
                setSeriesName(leitor.nextLine());

                System.out.println("Digite o ano de lançamento: ");
                setSeriesYear(leitor.nextInt());

                System.out.println("Digite a produtora: ");
                setSeriesProducer(leitor.nextLine());
                break;

            case 3:

                System.out.println(" ****** Documentário ******");

                System.out.println("Digite o nome: ");
                setDocumentaryName(leitor.nextLine());

                System.out.println("Digite o ano de lançamento: ");
                setDocumentaryYear(leitor.nextInt());

                System.out.println("Digite a produtora: ");
                setDocumentaryProducer(leitor.nextLine());
                break;
            case 0:
                System.out.println("Fim do programa");
                System.out.println("=================================================");
                break;
        }
    }

    public static String getDocumentaryName() {
        return documentaryName;
    }

    public static void setDocumentaryName(String documentaryName) {
        MovieList.documentaryName = documentaryName;
    }

    public static String getSeriesProducer() {
        return seriesProducer;
    }

    public static void setSeriesProducer(String seriesProducer) {
        MovieList.seriesProducer = seriesProducer;
    }

    public static String getSeriesName() {
        return seriesName;
    }

    public static void setSeriesName(String seriesName) {
        MovieList.seriesName = seriesName;
    }

    public static int getDocumentaryYear() {
        return documentaryYear;
    }

    public static void setDocumentaryYear(int documentaryYear) {
        MovieList.documentaryYear = documentaryYear;
    }

    public static String getDocumentaryProducer() {
        return documentaryProducer;
    }

    public static void setDocumentaryProducer(String documentaryProducer) {
        MovieList.documentaryProducer = documentaryProducer;
    }

    public static int getSeriesYear() {
        return seriesYear;
    }

    public static void setSeriesYear(int seriesYear) {
        MovieList.seriesYear = seriesYear;
    }

    public static int getMovieYear() {
        return movieYear;
    }

    public static void setMovieYear(int movieYear) {
        MovieList.movieYear = movieYear;
    }

    public static String getMovieGenre() {
        return movieGenre;
    }

    public static void setMovieGenre(String movieGenre) {
        MovieList.movieGenre = movieGenre;
    }

    public static String getMovieDescription() {
        return movieDescription;
    }

    public static void setMovieDescription(String movieDescription) {
        MovieList.movieDescription = movieDescription;
    }

    public static String getMovieName() {
        return movieName;
    }

    public static void setMovieName(String movieName) {
        MovieList.movieName = movieName;
    }
}
