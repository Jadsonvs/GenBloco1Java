/*
 6-	Escrever um programa que receba v�rios n�meros inteiros no teclado.
  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
package LacoRepeticao;

import java.util.*;

public class Atividade2DoWhile {

	public static void main(String[] args) {
		
		int x, cont=0, media=0, soma=0;
		Scanner ler = new Scanner(System.in);
		
		
		do
		{
			System.out.print("Digite um n�mero: ");
			x = ler.nextInt();
			
			if(x%3 == 0 && x%2 != 0)
			{
				cont++;
				soma = soma+x;
				media = soma/cont;
			}
				
		}while(x>1);
		System.out.print("M�dia dos valores m�ltiplos de 3 �: "+media);
	}

}
