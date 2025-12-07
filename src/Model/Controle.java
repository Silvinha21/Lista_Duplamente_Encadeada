package Model;
import java.util.Scanner;

public class Controle {
    Lista lista = new Lista();
    public void escolher(int opcao) {
        if(opcao < 0 || opcao > 9) {
            System.out.println("\n--- Opção inválida ---");
            return;
        }
        Scanner sc = new Scanner(System.in);
        switch (opcao) {
            case 1:
                lista.adicionarProdutoNoComeco(criarProduto());
                break;
            case 2:
                lista.adicionaProdutoNoFinal(criarProduto());
                break;
            case 3:
                System.out.print("Posição para adicionar o produto: ");
                int pos = sc.nextInt();
                lista.adicionarPorPosicao(pos, criarProduto());
                break;
            case 4:
                lista.removerProdutoDoComeco();
                break;
            case 5:
                lista.removerProdutoDoFinal();
                break;
            case 6:
                System.out.print("Posição para remover o produto: ");
                int posRemov = sc.nextInt();
                lista.removerPorPosicao(posRemov);
                break;
            case 7:
                System.out.print("Posição do produto (índice inicia em 0): ");
                int posicao = sc.nextInt();
                lista.verificarPosicao(posicao);
                break;
            case 8:
                lista.listarProdutos();
                break;
            case 9:
                System.out.print("Nome do produto para pesquisar: ");
                String nome = sc.nextLine();
                lista.pesquisarPorNome(nome);
                break;
            case 0:
                break;
        }
    }

    public Produto criarProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Produto ---");    
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Código: ");
                String cod = sc.nextLine();
                System.out.print("Quantidade: ");
                int qtd = sc.nextInt();
                System.out.print("Preço: ");
                float preco = sc.nextFloat();
        return new Produto(nome, cod, qtd, preco);
    }
}
