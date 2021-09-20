package Atividades.Atividades6;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
public class Investimento {

    public static void main(String args[]){
        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        double valorInicial = 5000.00; // valor original
        double percentual = 2.0 / 100.0; // 2%

        System.out.println("Valor inicial de investimento : " + valorInicial);

        for (int mes = 1; mes <= 24; mes++) {
            valorInicial += (valorInicial * percentual);
            System.out.println( "Mês : " + mes + "\n Valor atualizado: " + currencyFormatter.format(valorInicial));
        }
    }
}
