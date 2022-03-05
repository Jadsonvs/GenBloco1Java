/*
4-Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
  Para tanto, a cada uma das pessoas era perguntado:
  idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 
  3, se a pessoa era agressiva).
  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.

 */
package LacoRepeticao;

	import java.util.*;

public class Atividade2While {
	
	public static void main(String[] args) {
		
		int x=0, idade, sexo, p, o=0,  tC=0, mN=0,hA=0, oC=0,nMais40=0, cMenor18=0;
		Scanner ler = new Scanner(System.in);
		
	
		
		while(x<2)
		{
			x++;
						
			System.out.print("\nDigite sua idade: ");
			idade = ler.nextInt();
			System.out.print("\n1-Femino\n2-Masculino\n3-Outros\nDigite seu sexo: ");
			sexo = ler.nextInt();
			System.out.print("\n1-Calma\n2-Nervosa\n3-Agressiva\nDigite sua personalidade: ");
			p = ler.nextInt();
			
			if(p==1)
			{
				tC++;
				
			}
			
			else if (sexo==1 && p==2)
			{
				mN++;
			}
			else if(sexo==2 && p==3)
			{
				hA++;
			}
			else if(sexo==3 && p==1)
			{
				oC++;
			}
			else if(idade>40 && p==2)
			{
				nMais++;
			}
			else if(idade<18 && p==1)
			{
				cMenor18++;
			}
			
			
		}
		System.out.print("\nNúmero de pessoas calmas: "+tC);
		System.out.print("\nNúmero de mulheres nervosas: "+mN);
		System.out.print("\nNúmero de homens agressivos: "+hA);
		System.out.print("\nNúmero de outros calmos: "+oC);
		System.out.print("\nNúmero de pessoas nervosas com mais de 40 anos: "+nMais40);
		System.out.print("\nNúmero de pessoas calmas com menos de 18 anos: "+cMenor18);
		
			
	}
}
