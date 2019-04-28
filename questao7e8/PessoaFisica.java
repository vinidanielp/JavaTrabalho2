package questao7e8;

public class PessoaFisica extends CadCli{
	
private String cpf;
	
	//Getters e Setters
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Construtor
	public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
		super(nome,endereco,telefone);
		this.cpf = cpf;
	}
	
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Cpf: " + this.getCpf());
	}	

}
