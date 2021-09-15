package Atividades.Atividade4.pacote;

public class ValidaRg {
    public static boolean isRg(String rg){
        boolean valido = true;
        if(rg.length() < 4 ){
            valido = false;
        }
        return valido;
    }
}
