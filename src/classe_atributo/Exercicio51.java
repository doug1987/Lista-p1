package classe_atributo;

import java.util.Scanner;

public class Exercicio51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var ler2 = new Scanner(System.in);
		var ler = new Scanner(System.in);
		var listCliente = new Cliente[5];
		
		for (int x = 0; x<=listCliente.length -1; x++)
		{
			var cliente = new Cliente();
			
			System.out.println("Entre com o Id: ");
			var id = ler.nextInt();
			cliente.id = id;
			
			System.out.println("Entre com o Nome: ");
			var nome = ler2.nextLine();
			cliente.nome = nome;
			
			System.out.println("Entre com o Iadede: ");
			var idade = ler.nextInt();
			cliente.idade = idade;
			
			System.out.println("Entre com o Email: ");
			var email = ler2.nextLine();
			cliente.nome = email;
			
			listCliente[x] = cliente;	
			
		}
		
		System.out.println("Maiores de 18 anos.");
		
		for (int x = 0; x<=listCliente.length -1; x++)
		{
			var cliente = listCliente[x];
			if( cliente.idade>18) {
			  System.out.println(cliente.nome);
			}
		}
			

	}

}
