package questao5e6;

public class FuncionarioSemEnsino extends Funcionario {

	public FuncionarioSemEnsino(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional, salario, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
	}
	
	public void status() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("ID funcionario: "+this.getCodigoFuncional());
		System.out.println("Salario: "+this.getSalario());
	}
}
