package Atividades.Atividades1;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    List<Produto> produtos = new ArrayList<>();

    private void cadastrarProduto(){
        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Código do produto: ");
        produto.setCodigoProduto(leitor.nextInt());

        System.out.print("Categoria do produto: ");
        leitor.nextLine();// limpa o scanner
        produto.setCategoria(leitor.nextLine());

        produtos.add(produto);
    }

    private void imprimirProdutos() {
        for(Produto produto : produtos){
            System.out.println("\nCódigo: " + produto.getCodigoProduto());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("\n\n");
        }
    }


    public static void main(String[] args){
        short opcao = 50;
        Scanner leitor = new Scanner(System.in);
        Teste teste = new Teste();

        do{
            teste.exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = leitor.nextShort();

            switch(opcao){
                case 1:
                    teste.cadastrarProduto();
                case 2:
                    teste.imprimirProdutos();
                case 50:
                    teste.exibirMenu();
                    break;
                default:
                    teste.exibirMenu();
            }
        }while(opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|        Menu de Opções                     |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Cadastrar Produto                    |");
        System.out.println("| 2 - Imprimir relatório de produtos       |");
        System.out.println("| 50 - Exibir o menu de opções              |");
        System.out.println("| 0 - Sair                                 |");
        System.out.println("+-------------------------------------------+");
    }
}
