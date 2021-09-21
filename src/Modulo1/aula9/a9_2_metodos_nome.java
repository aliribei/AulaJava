package Modulo1.aula9;

public class a9_2_metodos_nome {

    public static void main(String[] args) {

        imprimir_nome("Maycon", "Granemann");
        String nc = retorna_nome_completo("Maycon", "Granemann");
        System.out.println("\n" + nc);
        double taxa = converte_taxa_juros(5);
        System.out.println(taxa);
        System.out.println(converte_taxa_juros(2));
    }

    static void imprimir_nome(String nome, String sobrenome) {

        System.out.printf("%s %s", nome, sobrenome);
    }

    static String retorna_nome_completo (String nome, String sobrenome){
        String nome_completo = nome + " " + sobrenome;
        return nome_completo;
    }

    static  double converte_taxa_juros(int juros_int) {
        double juros_double = juros_int;
        double percentual = juros_double/100;
        return percentual;
    }
}
