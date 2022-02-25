package Introdução;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int anos, meses, dias, calcA, calcM;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		calcA = dias / 365;
		calcM = dias / 30;
		
		System.out.println("Idade em anos: " + calcA);
		System.out.println("Idade em meses: " + calcM);
		System.out.println("Idade em dias: " + dias);
		

	}

}
