package questao5e6;

public class FuncionarioGraduado extends Funcionario{

	public FuncionarioGraduado(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional,salario, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
	}

	public void calcularsalario() {
		setSalario(getSalario() * 2);
	}
}
