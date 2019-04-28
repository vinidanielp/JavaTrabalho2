package questao5e6;

public class FuncionarioEnsinoMedio extends Funcionario{
	
	public FuncionarioEnsinoMedio(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional,salario, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
	}

	public void calcularrendatotal() {
		setSalario(getSalario()*1.5);
	}
	public void status() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("ID funcionario: "+this.getCodigoFuncional());
		System.out.println("Salario: "+this.getSalario());
		System.out.println("Escola ensino basico: "+this.getEscolaensinobasico());
		System.out.println("Escola ensino medio: "+this.getEscolaensinomedio());
	}

}
