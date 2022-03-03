package condicional;

import java.util.*;

public class AtividadePlataforma {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
		nome = ler.nextLine();
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome é: %s", nome);
		System.out.printf("\nSua idade é: %d", idade);
		
		if(idade>=18)
		{
			System.out.printf("\nVocê é maior de idade...");
		}
		else if(idade>=1 && idade<18)
		{
			System.out.printf("\nVocê é menor de idade...");
		}
		else
		{
			System.out.printf("\nVocê entrou com uma idade ínvalida...");
		}
		

	}

}
