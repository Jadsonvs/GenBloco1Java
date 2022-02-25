package Introdução;

import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, resp;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade em anos: ");
		anos = leia.nextInt();
		System.out.print("Digite sua idade em meses: ");
		meses = leia.nextInt();
		System.out.print("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		resp = dias;
		System.out.println("Sua idade em dias é " + resp);

	}

}
