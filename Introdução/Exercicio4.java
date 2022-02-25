package Introdução;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int a, b, c, d, r, s;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		a = leia.nextInt();
		System.out.print("Digite o 2º número: ");
		b = leia.nextInt();
		System.out.print("Digite o 3º número: ");
		c = leia.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		
		d = (r + s) / 2;
		
		System.out.println("O valor de d é: " + d);
		
		
	}

}
