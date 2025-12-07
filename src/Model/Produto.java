package Model;

public class Produto {
    private String nome;
    private String cod;
    private int qtd;
    private float preco;
    public Produto(String nome, String cod, int qtd, float preco) {
        this.nome = nome;
        this.cod = cod;
        this.qtd = qtd;
        this.preco = preco;
    }
    public Produto() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "\n[nome=" + nome + "\n cod=" + cod + "\n qtd=" + qtd + "\n preco=" + preco + "]";
    }
}
