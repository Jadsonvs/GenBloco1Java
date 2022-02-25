package Introdução;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, distancia;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Valor do primeiro ponto X e Y respectivamente: ");
		x1 = leia.nextDouble();
		y1 = leia.nextDouble();
		System.out.println("Valor do segundo ponto X e Y respectivamente: ");
		x2 = leia.nextDouble();
		y2 = leia.nextDouble();
		
		distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.println("Distância entre o primeiro ponto e o segundo: " + distancia);
		
	}

}
