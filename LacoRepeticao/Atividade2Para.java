/*
 2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
		System.out.print("\nQuantidade de números pares: "+par);
		System.out.print("\nQuantidade de números impares: "+impar);
		

}
	
}