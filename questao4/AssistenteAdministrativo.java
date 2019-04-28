package questao4;

public class AssistenteAdministrativo extends Funcionario {
	private int num_matricula;
	private int turno;
	
	
	public int getNum_matricula() {
		return num_matricula;
	}
	public void setNum_matricula(int num_matricula) {
		this.num_matricula = num_matricula;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	
	public double CalculaSalarioAssitAdm(){
		return this.getSalario()*1.3;
	}

}
