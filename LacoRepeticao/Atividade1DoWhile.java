/*
 5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
    No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */

package LacoRepeticao;

import java.util.*;

public class Atividade1DoWhile {

	public static void main(String[] args) {
		
		int x, soma=0;
		Scanner ler = new Scanner(System.in);
		
		
		do
		{
			System.out.print("Digite um n�mero: ");
			x = ler.nextInt();
			
			soma = soma+x;
			
			
		}while(x>0);
		System.out.print("A soma dos valores digitado �: "+soma);
	}

}
