package questão2;

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
	
	//Método toString()
		public String toString() {
	        return "Nome: " + this.nome + ", Preço: " + this.preco + ", Autor: " + this.autor;
	    }
}