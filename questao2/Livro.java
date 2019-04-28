package quest�o2;

public class Livro extends Produto{
	
	private String autor;
	
	//Construtor
	public Livro(String nome, double preco, String autor){
		super(nome,preco);
		this.autor = autor;
	}

	//Getters e Setters
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//M�todo toString()
		public String toString() {
	        return "Nome: " + this.nome + ", Pre�o: " + this.preco + ", Autor: " + this.autor;
	    }
}