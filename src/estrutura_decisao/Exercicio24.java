package estrutura_decisao;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, estciv;
		int anos;
		
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("Digite seu sexo (F) para feminino e (M) para masculino: ");
		sexo = ler.nextLine();
		
		System.out.printf("Digite seu estado civil:");
		estciv = ler.nextLine();
		
		if(sexo .equals("F")  || estciv .equals("casada")) {
			System.out.printf("Digite a quantos anos e casada:");
			anos = ler.nextInt();
			System.out.printf("Nome: %s; Sexo: %s; Estado civil: %s; Anos de casamento:%d ", nome, sexo, estciv, anos);
		}
		else {
			System.out.printf("Nome: %s; Sexo: %s; Estado civil: %s.", nome, sexo, estciv);
		}


	}

}
