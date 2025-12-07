package Model;

public class Celula {
	
	private Celula proximo;
	private Produto produto;
	private Celula anterior;
	
	public Celula(Celula proximo, Produto produto, Celula anterior) {
		super();
		this.proximo = proximo;
		this.produto = produto;
		this.anterior = anterior;
	}
	public Celula(Celula proximo, Produto produto) {
		super();
		this.proximo = proximo;
		this.produto = produto;
	}
	public Celula() {
		super();
	}
	public Celula(Produto produto, Celula anterior) {
		super();
		this.produto = produto;
		this.anterior = anterior;
	}
	
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

}
