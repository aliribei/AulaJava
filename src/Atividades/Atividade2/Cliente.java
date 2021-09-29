package Atividades.Atividade2;

public class Cliente {

    private String nomeCliente;
    private int idade;

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente(){

        return nomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente){
    }

    public String getSobrenomeCliente(){
        return nomeCliente;
    }


    public void setIdade(int idade){

        this.idade = idade;
    }

    public int getIdade(){

        return idade;
    }

}
