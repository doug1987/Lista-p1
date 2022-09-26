package estrutura_decisao;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// ex14-Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².
		
		Scanner ler = new Scanner(System.in);
	        
        double alt, peso, imc;
       
        System.out.printf("Digite a sua altura: ");
        alt = ler.nextDouble();
       
        System.out.printf("Digite o seu peso: ");
        peso = ler.nextDouble();
        
        imc = peso / (alt * alt);
        
        if (imc < 20) {
            System.out.printf("Abaixo peso");
        }else if(imc < 25) {
            System.out.printf("Peso ideal");
        }
        else {
            System.out.printf("Acima do peso"); 
        }
    }
}



	



