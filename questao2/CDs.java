package questão2;

public class CDs extends Produto{
	
	private int num_faixas;
	
	//Construtor
	public CDs(String nome, double preco, int num_faixas){
		super(nome,preco);
		this.num_faixas = num_faixas;
	}
	
	//Getters e Setters
	public int getNum_faixas() {
		return num_faixas;
	}
	public void setNum_faixas(int num_faixas) {
		this.num_faixas = num_faixas;
	}
	
	//Metodo toString()
	public String toString() {
        return "Nome: " + this.nome + ", Preço: " + this.preco + ", Número de faixas: " + this.num_faixas;
    }
}


