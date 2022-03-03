package condicional;

import java.util.*;

public class Atividade4 {

	public static void main(String[] args) {
		
		int x, q;
		double r;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		x = ler.nextInt();
		
		
		if(x%2 == 0)
		{
			r = Math.sqrt(x);
			System.out.print("\nO número é par");
			System.out.print("\nO valor da raíz quadrada é: " + r);
		}
		else if(x%2 == 1)
		{
			q = x*x;
			System.out.print("\nO número é ímpar");
			System.out.print("\nO valor do número ao quadrado é: " + q);
		}
	

	}

}
