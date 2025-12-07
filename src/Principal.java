import java.util.Scanner;
/* (Bibliotecas usadas anteriormente para testar o métodos que estavam tudo dando errado >:| )
import java.util.ResourceBundle.Control;
import Model.Lista;
import Model.Produto;
*/
import Model.Controle;

public class Principal {

	public static void main(String[] args) {
		
		Scanner escolha = new Scanner(System.in);
		Controle c = new Controle();
		int esc;
		while (true) {
		System.out.println("\n ---------CADASTRO PRODUTO---------");
		System.out.println("[1] - Adicionar produto no incio");
		System.out.println("[2] - Adicionar produto no fim");
		System.out.println("[3] - Adicionar produto por posição");
		System.out.println("[4] - Remover produto no inicio");
		System.out.println("[5] - Remover produto no fim");
		System.out.println("[6] - Remover produto por posição");
		System.out.println("[7] - Verificar posição do produto");
		System.out.println("[8] - Listar produtos");
		System.out.println("[9] - Pesquisar produto por nome");
		System.out.println("[0] - Sair");
		System.out.print("Escolha uma opção: "); 
		esc = escolha.nextInt();
		if (esc == 0) {
			break;
		}
		c.escolher(esc);
	}
}
}