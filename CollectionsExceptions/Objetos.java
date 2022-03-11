package CollectionsExceptions;

import java.util.ArrayList;

public class Objetos {

	public static void main(String[] args) {
		
		Estoque p1 = new Estoque("Bolacha", 10, 2030);
		Estoque p2 = new Estoque("Katchup", 2, 2032);
		Estoque p3 = new Estoque("Feijão", 20, 2039);
		Estoque p4 = new Estoque("Macarrão", 9, 2024);
		Estoque p5 = new Estoque("Creme dental", 18, 2022);
		
		ArrayList<Estoque> alimento = new ArrayList<>();
		System.out.println(alimento);
		
		
		alimento.add(p1);
		alimento.add(p2);
		alimento.add(p3);
		System.out.println(alimento);
		
		System.out.println("\n");
		System.out.println("REMOVENDO: "+alimento.get(0)+" E "+alimento.get(2));
		alimento.remove(p1);
		alimento.remove(p3);	
		System.out.println(alimento);
		
		System.out.println("\n");
		alimento.add(p4);
		System.out.println("ADICIONANDO: "+alimento.get(1));
		System.out.println(alimento);
		
		
		System.out.println("\n");
		System.out.println("ATUALIZANDO: "+alimento.get(0));
		alimento.set(0, p5);
		System.out.println("PARA: "+alimento.get(0));
		System.out.println(alimento);
		
		
		
	
		
	}

}
