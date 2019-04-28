package questao7e8;

public abstract class CadCli implements MostrarInformacao{
	
	protected String nome;
	protected String endereco;
	protected String telefone;
	
	//Getters e Setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Método
	public void imprimeDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());		
	}	
	
	//Construtor
	public CadCli(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

}
