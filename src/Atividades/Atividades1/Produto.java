package Atividades.Atividades1;

public class Produto {
    private int codigoProduto;
    private float valor;
    private String categoria;
    private String nome;
    private String descricao;

    public void setValor(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }

    public void setCodigoProduto(int codigoProduto){
        this.codigoProduto = codigoProduto;
    }

    public int getCodigoProduto(){
        return codigoProduto;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
