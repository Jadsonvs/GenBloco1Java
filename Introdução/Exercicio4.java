package Introdu��o;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int a, b, c, d, r, s;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o 1� n�mero: ");
		a = leia.nextInt();
		System.out.print("Digite o 2� n�mero: ");
		b = leia.nextInt();
		System.out.print("Digite o 3� n�mero: ");
		c = leia.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		
		d = (r + s) / 2;
		
		System.out.println("O valor de d �: " + d);
		
		
	}

}
