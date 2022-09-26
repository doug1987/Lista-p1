package estrutura_decisao;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
int a, b, c;
		
		System.out.printf("Digite um valor qualquer: ");
		a = ler.nextInt();
		
		System.out.printf("Digite um valor qualquer: ");
		b = ler.nextInt();
		
		System.out.printf("Digite um valor qualquer: ");
		c = ler.nextInt();
		
		if(a<b) {
			if(b<c) {
				System.out.printf("Ordem Crescente: %d, %d, %d.", a, b, c);
			}else {
				System.out.printf("Ordem Crescente: %d, %d, %d.", a, c, b);
			}
		}else {
			if(a<c) {
				System.out.printf("Ordem Crescente: %d, %d, %d.", b, a, c);
			}else {
				System.out.printf("Ordem Crescente: %d, %d, %d.", c, b, a);
			}

	}

	}}

