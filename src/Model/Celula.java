package Model;

public class Celula {
	
	private Celula proximo;
	private Object elemento;
	private Celula anterior;
	
	public Celula(Celula proximo, Object elemento, Celula anterior) {
		super();
		this.proximo = proximo;
		this.elemento = elemento;
		this.anterior = anterior;
	}
	public Celula(Celula proximo, Object elemento) {
		super();
		this.proximo = proximo;
		this.elemento = elemento;
	}
	public Celula() {
		super();
	}
	public Celula(Object elemento, Celula anterior) {
		super();
		this.elemento = elemento;
		this.anterior = anterior;
	}
	
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	

}
