package questao3;

import java.util.ArrayList;
import java.util.List;

public class FormasGeometricas {
	
	public static void main(String[] args) {
		
		List<Calculos> formas = new ArrayList<Calculos>();
		
		Calculos ret1 = new Retangulo(10,5,10,5);
		Quadrilateros ret2 = new Retangulo(10,5,10,5);
		Calculos quad1 = new Quadrado(5,5,5,5);
		Quadrilateros quad2 = new Quadrado(10,10,10,10);
		Calculos cir1 = new Circulo(10);
		Calculos cir2 = new Circulo(20);
		
		formas.add(ret1);
		formas.add(ret2);
		formas.add(quad1);
		formas.add(quad2);
		formas.add(cir1);
		formas.add(cir2);
		
		for(Calculos fG: formas){
			System.out.print(fG.toString());
			System.out.println("\n");
		}
		
		System.out.println("\n");
		
		for(Calculos fG: formas){
			System.out.print(fG.calculaArea());
			System.out.println("\n");
			System.out.print(fG.calculaPerimetro());
			System.out.println("\n");
		}

	}

}
