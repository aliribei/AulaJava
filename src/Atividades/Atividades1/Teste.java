package Atividades.Atividades1;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    List<Produto> produtos = new ArrayList<>();

    private void cadastrarProduto(){
        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Nome do produto: ");
        produto.setNome(leitor.nextLine());

        System.out.print("Código do produto: ");
        produto.setCodigoProduto(leitor.nextInt());

        System.out.print("Valor do produto: ");
        produto.setValor(leitor.nextFloat());

        System.out.print("Categoria do produto: ");
        leitor.nextLine();// limpa o scanner
        produto.setCategoria(leitor.nextLine());

        System.out.print("Descrição do produto: ");
        produto.setDescricao(leitor.nextLine());

        leitor.nextLine();// limpa o scanner
        produtos.add(produto);
    }

    private void imprimirProdutos() {
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        for(Produto produto : produtos){
            System.out.println("Lista de produtos cadastrados");
            System.out.println("Nome:   " + produto.getNome().toUpperCase());
            System.out.println("Código: " + produto.getCodigoProduto());
            System.out.println("Valor:  " + dinheiro.format(produto.getValor()));
            System.out.println("Categoria: " + produto.getCategoria().toUpperCase());
            System.out.println("Descrição: " + produto.getDescricao().toUpperCase());
            System.out.println("\n\n");
        }
    }

    public static void main(String[] args){
        short opcao = 3;
        Scanner leitor = new Scanner(System.in);
        Teste teste = new Teste();

        do{
            teste.exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = leitor.nextShort();

            switch(opcao){
                case 1:
                    teste.cadastrarProduto();
                    System.out.println("Produto Cadastrado com sucesso");
                    break;
                case 2:
                    teste.imprimirProdutos();
                    break;
                case 3:
                    teste.exibirMenu();
                    break;
            }
        }while(opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|        Cadastro de produtos               |");
        System.out.println("|          Escolha uma opção:               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Cadastrar Produto                    |");
        System.out.println("| 2 - Imprimir relatório de produtos       |");
        System.out.println("| 3 - Exibir o menu de opções              |");
        System.out.println("| 0 - Sair                                 |");
        System.out.println("+-------------------------------------------+");
    }
}
