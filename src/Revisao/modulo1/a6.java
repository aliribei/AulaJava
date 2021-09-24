package modulo1;

public class a6 {
    public static void main(String[] args) {
        //estrutura condicional 

        boolean executa = false;
        boolean verdade = true;
        boolean resultado =  verdade && !executa;

        if ( executa ) {
            System.out.println( "Entrou n if 1" );
        };


         if ( !verdade ) {
            System.out.println( "Entrou n if 2" );
        };
        
        if ( verdade || executa ) {
            System.out.println( "Entrou n if 3" );
        };

        if ( verdade && !executa ) {
            System.out.println( "Entrou n if 4" );
        };

        if ( verdade && executa ) {
            System.out.println( "Entrou n if 5" );
        };

        if ( resultado ) {
            System.out.println( "Entrou n if 6" );
        };

        System.out.println( "Fora do if" );
    }
}
