package Condicoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite a primeira nota");
		double nota1 = sc.nextDouble();
		
		
		System.out.println("Digite a segunda nota");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		System.out.println("A sua média é:" + media);
		

		if (media >= 7) {
			System.out.println("Você está aprovado");
		}
		
		else if (media>= 5) {
			System.out.println("Você está de recuperação");
		
		System.out.println("Digite a nota da recuperação:");
		double notaRec = sc.nextDouble();
		
		double mediafinal = (media + notaRec) / 2;
		
		System.out.println("A sua media foi de:" + mediafinal);
		
		if (media >= 7) {
			System.out.println("Você está aprovado");
		}
		

		else {
			System.out.println("Você está reprovado");
		}
		

		}
		
		else {
			System.out.println("Você está reprovado");
		}
		
		
	
		sc.close();
	}

}
