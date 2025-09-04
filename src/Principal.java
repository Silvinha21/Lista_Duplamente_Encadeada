import java.util.Scanner;

import Model.Lista;

public class Principal {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		int cont = 0;
		Lista l = new Lista();
		while(cont<=4) {
			
			l.adicionarNoComeco(in.nextInt());
			
			cont++;
			
		}
		
		l.listarElementos();

		l.adicionaNoFinal(50);
		
		l.adicionarPorPosicao(3, 12);
		
		l.listarElementos();
		/*
		 * 
		 l.removerInicio();
		 
		 l.listarElementos();
		 
		 l.removerDoFim();
		 
		 l.listarElementos();
		 
		 l.removerPorPosicao(2);
		 
		 l.listarElementos();
		 */
		}
		
		

}
