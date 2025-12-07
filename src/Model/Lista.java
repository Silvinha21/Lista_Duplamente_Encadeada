package Model;

public class Lista {

    private Celula cabeca;
    private Celula cauda;
    private int totalProdutos = 0;

    
    public void adicionarProdutoNoComeco(Produto produto) {
        Celula nova = new Celula(this.cabeca, produto);

        if (this.totalProdutos == 0) {
            this.cabeca = nova;
            this.cauda = nova;
        } else {
            this.cabeca.setAnterior(nova);
            this.cabeca = nova;
        }

        this.totalProdutos++;
    }

    
    public void adicionaProdutoNoFinal(Produto produto) {
        if (this.totalProdutos == 0) {
            adicionarProdutoNoComeco(produto);
            return;
        }

        Celula nova = new Celula(produto, this.cauda);
        this.cauda.setProximo(nova);
        this.cauda = nova;
        this.totalProdutos++;
    }

    
    public void adicionarPorPosicao(int pos, Produto p) {

        if (pos < 0 || pos > totalProdutos) {
            System.out.println("\n--- Posição inválida ---");
			return;
        }

        if (pos == 0) {
            adicionarProdutoNoComeco(p);
            return;
        }

        if (pos == totalProdutos) {
            adicionaProdutoNoFinal(p);
            return;
        }

        Celula aux = this.cabeca;
        for (int i = 0; i < pos - 1; i++) {
            aux = aux.getProximo();
        }

        Celula nova = new Celula(aux.getProximo(), p, aux);
        aux.getProximo().setAnterior(nova);
        aux.setProximo(nova);

        totalProdutos++;
    }


    public void removerProdutoDoComeco() {
        if (totalProdutos == 0) {
            System.out.println("\n--- Lista vazia ---");
            return;
        }

        if (totalProdutos == 1) {
            cabeca = null;
            cauda = null;
        } else {
            cabeca = cabeca.getProximo();
            cabeca.setAnterior(null);
        }

        totalProdutos--;
    }


    public void removerProdutoDoFinal() {
        if (totalProdutos == 0) {
            System.out.println("\n --- Lista vazia ---");
            return;
        }

        if (totalProdutos == 1) {
            removerProdutoDoComeco();
            return;
        }

        Celula novaCauda = this.cauda.getAnterior();
        novaCauda.setProximo(null);
        this.cauda = novaCauda;

        totalProdutos--;
    }


    public void removerPorPosicao(int pos) {
        if (pos < 0 || pos >= totalProdutos) {
            System.out.println("\n--- Posição inválida ---");
			return;
        }

        if (pos == 0) {
            removerProdutoDoComeco();
            return;
        }

        if (pos == totalProdutos - 1) {
            removerProdutoDoFinal();
            return;
        }

        Celula aux = cabeca;
        for (int i = 0; i < pos - 1; i++) {
            aux = aux.getProximo();
        }

        Celula removida = aux.getProximo();
        Celula posterior = removida.getProximo();

        aux.setProximo(posterior);
        posterior.setAnterior(aux);

        totalProdutos--;
    }


    public void listarProdutos() {
        if (totalProdutos == 0) {
            System.out.println("\nX---X Lista vazia X---X");
            return;
        }
		System.out.println("\n--- Lista de Produtos ---");
        Celula atual = cabeca;
        while (atual != null) {
            System.out.println(atual.getProduto());
            atual = atual.getProximo();
        }
    }

	public void pesquisarPorNome(String nome) {
		if (totalProdutos == 0) {
			System.out.println("\nX---X Lista vazia X---X");
			return;
		}
		System.out.println("\n--- Resultado da pesquisa ---");
		Celula atual = cabeca;
		boolean encontrado = false;
		while (atual != null) {
			if (atual.getProduto().getNome().equalsIgnoreCase(nome)) {
				System.out.println(atual.getProduto());
				encontrado = true;
			}
			atual = atual.getProximo();
		}
		if (!encontrado) {
			System.out.println("\n--- Produto não encontrado ---");
		}
	}

	public void verificarPosicao(int pos) {
		if (pos < 0 || pos >= totalProdutos) {
			System.out.println("\n--- Posição inválida ---");
			return;
		}
		Celula atual = cabeca;
		for (int i = 0; i < pos; i++) {
			atual = atual.getProximo();
		}
		System.out.println("\n--- Produto na posicao " + pos + " ---");
		System.out.println(atual.getProduto().toString());

	}
}
