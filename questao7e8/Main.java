package questao7e8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Pessoas Fisicas
		PessoaFisica pf1 = new PessoaFisica("Vinicius", "Rua 45, N. 98, Qd. 2, Lt. 23, Bairro Lírios do Campo", "62 99524-6655", "745.555.623-55");
		PessoaFisica pf2 = new PessoaFisica("Vitória", "Rua 27, N. 55, Qd. 7, Lt. 66, Bairro Campinas", "62 99525-3321", "546.998.254-93");
		PessoaFisica pf3 = new PessoaFisica("Ana Maria", "Rua 66, N. 7, Qd. 44, Lt. 6, Bairro Jk Nova Capital", "62 98563-1234", "452.235.563-44");
		PessoaFisica pf4 = new PessoaFisica("Rafaela", "Rua 21, N. 18, Qd. 33, Lt. 7, Bairro Pirineus", "62 99123-5654", "741.666.658-57");
		
		//Pessoas Juridicas
		PessoaJuridica pj1 = new PessoaJuridica("Maria Clara", "Rua 22, N. 3, Qd. 61, Lt. 14, Bairro Jundiaí", "62 99321-9874", "21.555.323/0001-25","Comercio de Alimentos");
		PessoaJuridica pj2 = new PessoaJuridica("Cleber", "Rua 77, N. 43, Qd. 61, Bairro Bom Clima", "14 99121-9377", "92.225.923/0001-99","Supermercado Kill");
		PessoaJuridica pj3 = new PessoaJuridica("Mauro João", "Rua 14, Qd. 61, Lt. 33, Bairro de Lourdes", "62 98563-2233", "54.653.853/0001-66","Marisas");
		PessoaJuridica pj4 = new PessoaJuridica("Caio Henrique", "Rua 6, N. 37, Qd. 61, Lt. 18, Bairro Joanapolis", "62 98123-1453", "32.578.223/0001-84","Auto Eletrica");
		PessoaJuridica pj5 = new PessoaJuridica("Lopes de Melo", "Rua 18, N. 77, Lt. 23, Bairro Libra", "62 99427-5632", "14.658.788/0001-99","Borracharia Maranhão");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("****Lista de Clientes****\n"
				+ "Codigo 0: Vinicius \n"
				+ "Codigo 1: Vitoria \n"
				+ "Codigo 2: Ana Maria \n"
				+ "Codigo 3: Rafaela\n"
				+ "Codigo 4: Maria Clara \n"
				+ "Codigo 5: Cleber \n"
				+ "Codigo 6: Mauro João \n"
				+ "Codigo 7: Caio Henrique \n"
				+ "Codigo 8: Lopes de Melo \n\n"
				+ "******Para saber mais informações dos cliente digite o código do cliente****** \n\n"
				+ "Digite o código do Cliente: \n");
	    String indice = scanner.next();		
		
		ArrayList<CadCli> pessoas = new ArrayList();
		pessoas.add(pf1);
		pessoas.add(pf2);
		pessoas.add(pf3);
		pessoas.add(pf4);
		pessoas.add(pj1);
		pessoas.add(pj2);
		pessoas.add(pj3);
		pessoas.add(pj4);
		pessoas.add(pj5);

		pessoas.get(Integer.valueOf(indice)).imprimeDados();
	}


}
