/*
 2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

package LacoRepeticao;

import java.util.*;

public class Atividade2Para {

	public static void main(String[] args) {
		
		int n, par=0, impar=0;
		Scanner ler = new Scanner(System.in);
		
		for(n=0; n<=10; n++)
		{
			System.out.print("Digite um valor: ");
			n = ler.nextInt();
			
			if(n%2==0)
			{
				par++;
				
			}
			else if(n%2==1)
			{
				impar++;
			}
		
		}
		System.out.print("\nQuantidade de n�meros pares: "+par);
		System.out.print("\nQuantidade de n�meros impares: "+impar);
		

}
	
}