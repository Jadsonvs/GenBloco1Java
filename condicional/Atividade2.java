package condicional;

import java.util.*;

public class Atividade2 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o 1� n�mero: ");
		n1 = ler.nextInt();
		System.out.printf("Digite o 2� n�mero: ");
		n2 = ler.nextInt();
		System.out.printf("Digite o 3� n�mero: ");
		n3 = ler.nextInt();
		
		if(n1<n2 && n1<n3)
		{
			System.out.print(n1 +"\n" + n2 + "\n"+ n3);
		}
		else if (n2<n1 && n2<n3)
		{
			System.out.print(n2 +"\n" + n1 + "\n"+ n3);
		}
		else if(n3<n1 && n3<n2)
		{
			System.out.print(n3 +"\n" + n1 + "\n"+ n2);
		}
	}

}
