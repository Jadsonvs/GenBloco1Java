/*
 5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
    No final, mostre a soma dos números digitados.(DO...WHILE)
 */

package LacoRepeticao;

import java.util.*;

public class Atividade1DoWhile {

	public static void main(String[] args) {
		
		int x, soma=0;
		Scanner ler = new Scanner(System.in);
		
		
		do
		{
			System.out.print("Digite um número: ");
			x = ler.nextInt();
			
			soma = soma+x;
			
			
		}while(x>0);
		System.out.print("A soma dos valores digitado é: "+soma);
	}

}
