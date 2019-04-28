package questão2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
public static void main(String[] args) {
		
		Livro livro1 = new Livro("Boi da cara preta",12.89,"Cristina W.");
		CDs cd1 = new CDs("BMTH",30.99,15);
		CDs cd2 = new CDs("Slipkno",65.45,33);
		DVDs dvd1 = new DVDs("Homem Liberola",5,"1:45:23");
		DVDs dvd2 = new DVDs("Máscara",12.55,"1:23:59");
		
		
		List<Produto> Lista = new ArrayList<>();
		
		Lista.add(livro1);
		Lista.add(cd1);
		Lista.add(cd2);
		Lista.add(dvd1);
		Lista.add(dvd2);
		
		System.out.println(Lista);
	}


}
