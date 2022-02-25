package Introdução;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double n1, n2, n3, soma, mediaF;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Aluno: Jadson Viana dos Santos");
		System.out.print("Português 1: ");
		n1 = leia.nextDouble();
		System.out.print("Português 2: ");
		n2 = leia.nextDouble();
		System.out.print("Português 3: ");
		n3 = leia.nextDouble();
		
		
		soma = (n1*2) + (n2*3) + (n3*5);
		mediaF = soma / (n1+n2+n3);
		
		System.out.println("Média aritmética ponderada das notas: " + mediaF);

	}

}
