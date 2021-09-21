package Atividades.Atividade6;
import java.text.NumberFormat;
import java.util.Locale;

public class Investimento {

    public static void main(String args[]){

        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        double valorInicial = 5000.00; // valor original
        double percentual = 2.0 / 100.0; // 2%

        System.out.println("Valor inicial de investimento: " + currencyFormatter.format(valorInicial));

        for (int mes = 1; mes <= 24; mes++) {

            double valorLucro = percentual * valorInicial;
            valorInicial += (valorInicial * percentual);

            System.out.println("*****************************");
            System.out.println("Mês: "+ mes);
            System.out.println("Rendimento mensal de: "+ currencyFormatter.format(valorLucro));
            System.out.println( "Valor atualizado: " + currencyFormatter.format(valorInicial));

        }
    }
}