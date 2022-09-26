package classe_atributo;

import java.util.Scanner;

public class Exercicio53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var ler = new Scanner(System.in);
		var listAluno = new Aluno[5];
		
		for (int x = 0; x<=listAluno.length -1; x++)
		{
			var aluno = new Aluno();
			
			System.out.println("Entre com o ra: ");
			var ra = ler.nextLine();
			aluno.ra = ra;
			
			System.out.println("Entre com o nome: ");
			var nome = ler.nextLine();
			aluno.nome = nome;
			
			var listMateria = new String[6];
			
			for (int y = 0; y<=listMateria.length -1; y++)
			{
			System.out.println("Entre com as matérias: ");
			var materias = ler.nextLine();
			listMateria[y] = materias;
			}
			aluno.materias = listMateria;
			
			
			System.out.println("Entre com o periodo: ");
			var periodo = ler.nextLine();
			aluno.periodo = periodo;
			
			listAluno[x] = aluno;
		}
		

		System.out.println("Somente alunos da noite.");
		
		
		for (int z = 0; z<=listAluno.length -1; z++)
		{
			var periodo = listAluno[z].periodo;
			if( periodo.equalsIgnoreCase("noite")) {
			  System.out.println(listAluno[z].nome);
			}
		
		
		
		}
	}

	}
