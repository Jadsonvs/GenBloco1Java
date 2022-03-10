package CollectionsExceptions;

import java.util.ArrayList;

public class Objetos {

	public static void main(String[] args) {
		
		Estoque p1 = new Estoque("Bolacha", 10, 2030);
		Estoque p2 = new Estoque("Katchup", 2, 2032);
		Estoque p3 = new Estoque("Feijão", 20, 2039);
		Estoque p4 = new Estoque("Macarrão", 9, 2024);
		
		ArrayList<Estoque> alimento = new ArrayList<>();
		System.out.println(alimento);
		
		alimento.add(p1);
		alimento.add(p2);
		alimento.add(p3);
		System.out.println(alimento);
		
		alimento.remove(p1);
		alimento.remove(p3);
		System.out.println(alimento);
		
		alimento.add(p4);
		System.out.println(alimento);
		
		
		
	
		
	}

}
