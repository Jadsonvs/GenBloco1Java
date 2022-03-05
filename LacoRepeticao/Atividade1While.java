/*
 3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
package LacoRepeticao;

import java.util.*;

public class Atividade1While {

	public static void main(String[] args) {
		
		int idade, menor21=0, maior50=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			
			if(idade<21)
			{
				menor21++;
			}
			else if(idade>50)
			{
				maior50++;
			}
			
		}
		System.out.print("\nTotal de pessoas com menos de 21 anos: "+menor21);
		System.out.print("\nTotal de pessoas com mais de 50 anos: "+maior50);

	}

}
