package questao7e8;

public class PessoaJuridica extends CadCli{
	
	private String cnpj;
	private String fantasia;
	
	//Getters e Setters
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getFantasia() {
		return fantasia;
	}
	
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
	//Construtor
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String fantasia) {
		super(nome,endereco,telefone);
		this.cnpj = cnpj;
		this.fantasia = fantasia;
	}
	

	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Cnpj: " + this.getCnpj());
		System.out.println("Nome Fantasia: " + this.getFantasia());
	}

	

}
