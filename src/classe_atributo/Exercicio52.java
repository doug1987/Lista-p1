package classe_atributo;

import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// criei mais de um ler pq ele quebrava a execução somente com 1.
		var ler3 = new Scanner(System.in);
		var ler2 = new Scanner(System.in);
		var ler = new Scanner(System.in);
		var listProduto = new Produto[10];
		
		for (int x = 0; x<=listProduto.length -1; x++)
		{
			var produto = new Produto();
			
			System.out.println("Entre com o Id: ");
			var id = ler.nextInt();
			produto.id = id;
			
			System.out.println("Entre com a descricao: ");
			var descricao = ler2.nextLine();
			produto.descricao = descricao;
			
			System.out.println("Entre com o valor: ");
			var valor = ler3.nextDouble();
			produto.valor = valor;
			
			System.out.println("Entre com a quantidade : ");
			var quantidade = ler3.nextDouble();
			produto.quantidade = quantidade;
			
			listProduto[x] = produto; 	
			
		}
		
		System.out.println("Valores maiores que 100.");
		
		for (int x = 0; x<=listProduto.length -1; x++)
		{
			var produto = listProduto[x];
			if( produto.valor>100) {
			  System.out.println(produto.valor);
			}
		}

	}

}
