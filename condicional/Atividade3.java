package condicional;

import java.util.*;

public class Atividade3 {

	public static void main(String[] args) {
		
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.printf("Voc� pertencen a categoria infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.printf("Voc� pertence a categoria juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.printf("Voc� pertence a categoria adulto");
		}
		else
		{
			System.out.printf("Voc� n�o pertence a categorinha nenhuma...");
		}
	}
		
}
