package condicional;

import java.util.*;

public class Atividade4 {

	public static void main(String[] args) {
		
		int x, q;
		double r;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		x = ler.nextInt();
		
		
		if(x%2 == 0)
		{
			r = Math.sqrt(x);
			System.out.print("\nO n�mero � par");
			System.out.print("\nO valor da ra�z quadrada �: " + r);
		}
		else if(x%2 == 1)
		{
			q = x*x;
			System.out.print("\nO n�mero � �mpar");
			System.out.print("\nO valor do n�mero ao quadrado �: " + q);
		}
	

	}

}
