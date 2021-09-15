package Atividades.Atividade4.pacote;

public class ValidaNome {
    public static boolean isNome(String nome){
        boolean valido = true;
        if(nome.length() < 3){
            valido = false;
        }
        return valido;
    }
}
