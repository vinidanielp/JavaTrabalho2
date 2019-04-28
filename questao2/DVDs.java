package quest�o2;

public class DVDs extends Produto{
	
	private String duracao;
	
	//Construtor
	
	public DVDs(String nome, double preco, String duracao){
		super(nome,preco);
		this.duracao = duracao;
	}
	
	//Getters e Setters
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	//M�todo toString()
	public String toString() {
        return "Nome: " + this.nome + ", Pre�o: " + this.preco + ", Dura��o: " + this.duracao;
    }

}