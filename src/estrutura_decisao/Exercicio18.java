package estrutura_decisao;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double a, v0, t, V;
		
		System.out.printf("Digite o valor da aceleração: \n");
		a = ler.nextDouble();
		
		System.out.printf("Digite a velocidade inicial: \n");
		v0 = ler.nextDouble();
		
		System.out.printf("Digite o tempo: \n");
		t = ler.nextDouble();
		
		V = v0 + (a * t);
		
		System.out.printf("A velocidade final é: %.2f m/s \n", V);
		
		double vkm;
		vkm = V * 3.6;
		
		if (vkm<=40) {
			System.out.printf("A velocidadede em Km/h é: %2.f \n", vkm);
			System.out.println("Veiculo muito lento!!");
		}
		
		else if (vkm<=60) {
			System.out.printf("A velocidadede em Km/h é: %2.f \n", vkm);
			System.out.println("Velocidade permitida!!");	
		}
		
		else if(vkm<=80) {
			System.out.printf("A velocidadede em Km/h é: %2.f \n", vkm);
			System.out.println("Velocidade de cruzeiro!!");
		}
		
		else if(vkm<=120) {
			System.out.printf("A velocidadede em Km/h é: %2.f \n", vkm);
			System.out.println("Veiculo rapido!!");
		}
		
		else {
			System.out.printf("A velocidadede em Km/h é: %2.f \n", vkm);
			System.out.println("Veiculo muito rápido!!");
		}
		

	}

}
