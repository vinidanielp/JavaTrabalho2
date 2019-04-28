package questao5e6;

public class FuncionarioEnsinoBasico extends Funcionario{
	
	public FuncionarioEnsinoBasico(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional,salario, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
	}
	public void calcularrendatotal() {
		setSalario(getSalario()*1.1);
	}
	public void status() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("ID funcionario: "+this.getCodigoFuncional());
		System.out.println("Salario: "+this.getSalario());
		System.out.println("Escola ensino basico: "+this.getEscolaensinobasico());
		
	}

}
