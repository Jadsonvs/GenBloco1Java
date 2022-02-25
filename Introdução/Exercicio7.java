package Introdução;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		c = leia.nextInt();
		System.out.print("Digite o valor de D: ");
		d = leia.nextInt();
		System.out.print("Digite o valor de E: ");
		e = leia.nextInt();
		System.out.print("Digite o valor de F: ");
		f = leia.nextInt();
		
		x = (c*e)-(b*f) / (a*e)-(b*d);
		y = (a*f)-(c*d) / (a*e)-(b*d);
		
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);

	}

}
