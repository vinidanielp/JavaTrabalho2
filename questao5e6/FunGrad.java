package questao5e6;

public class FunGrad {
	
	public static void main(String[] args) {
		FuncionarioGraduado f1 = new FuncionarioGraduado("roberto", "23425", 1000,"arturmachado","robettodemares","uinvaglico");
		f1.calcularsalario();
		f1.status();
		FuncionarioSemEnsino f4 = new FuncionarioSemEnsino("carlos","1245335",3000, null, null, null);
		f4.calcularsalario();
		f4.status();
		FuncionarioEnsinoBasico t5 = new FuncionarioEnsinoBasico("mikamito","2543",500,"teste1234",null,null);
		t5.calcularrendatotal();
		t5.status();
		FuncionarioEnsinoMedio y7 = new FuncionarioEnsinoMedio("vinicus","3432",900,"Anhanguera","Municipal",null);
		y7.calcularrendatotal();
		y7.status();
		
	}

}
