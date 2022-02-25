package Introdução;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		int carroN,  custoF, percD, impostos;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Custo de fábrica de um carro: ");
		custoF = leia.nextInt();
		
		percD = (custoF*28)/100;
	    impostos = (custoF*45)/100;
	    carroN = custoF + percD + impostos; 
	    
	    System.out.println("Porcentagem do distruidor: " + percD);
	    System.out.println("Impostos: " + impostos);
	    System.out.println("Valor do carro novo ao consumidor: " + carroN);
		
		
		
	}

}
