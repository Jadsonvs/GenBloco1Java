package Introdução;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a duração do evento em segundos: ");
		segundos = leia.nextInt();
		
		minutos = segundos / 60;
		horas = minutos / 60;
		
		System.out.println("Duração do evento em horas: " + horas);
		System.out.println("Duração do evento em minutos: " + minutos);
		System.out.println("Duração do evento em segundos: " + segundos);
		
		

	}

}
