package condicional;

import java.util.*;

public class Atividade1 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o 1º número: ");
		n1 = ler.nextInt();
		System.out.printf("Digite o 2º número: ");
		n2 = ler.nextInt();
		System.out.printf("Digite o 3º número: ");
		n3 = ler.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			
			System.out.printf("\nO maior número é : %d", n1);
			
		}
		else if(n2>n1 && n2>n3)
		{
			
			System.out.printf("\nO maior número é: %d", n2);
			
		}
		else if(n3>n1 && n3>n2)
		{
			
			System.out.printf("\nO maior número é: %d", n3);
		}
		else
		{
			
			System.out.println("\nVocê entrou com uma idade ínvalida...");
		}

	}

}
