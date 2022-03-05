/*
 6-	Escrever um programa que receba vários números inteiros no teclado.
  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
package LacoRepeticao;

import java.util.*;

public class Atividade2DoWhile {

	public static void main(String[] args) {
		
		int x, cont=0, media=0, soma=0;
		Scanner ler = new Scanner(System.in);
		
		
		do
		{
			System.out.print("Digite um número: ");
			x = ler.nextInt();
			
			if(x%3 == 0 && x%2 != 0)
			{
				cont++;
				soma = soma+x;
				media = soma/cont;
			}
				
		}while(x>1);
		System.out.print("Média dos valores múltiplos de 3 é: "+media);
	}

}
