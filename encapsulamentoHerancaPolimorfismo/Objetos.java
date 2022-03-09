package encapsulamentoHerancaPolimorfismo;

public class Objetos {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica p = new Preguica();
		
		System.out.println("----Cachorro----");
		c1.setNome("Bob");
		System.out.println("Nome do animal: "+c1.getNome());
		c1.setIdade(13);
		System.out.println("Idade do animal: "+c1.getIdade());
		c1.setEmiteSom(true);
		c1.som();
		c1.tipoDeSom();
		c1.setCorre(true);
		c1.acao();
		
		System.out.println("\n----Cavalo----");
		cav1.setNome("Hugo");
		System.out.println("Nome do animal: "+cav1.getNome());
		cav1.setIdade(10);
		System.out.println("Idade do animal: "+cav1.getIdade());
		cav1.setEmiteSom(true);
		cav1.som();
		cav1.tipoDeSom();
		cav1.setCorre(true);
		cav1.acao();
		
		System.out.println("\n----Preguiça----");
		p.setNome("Anne");
		System.out.println("Nome do animal: "+p.getNome());
		p.setIdade(6);
		System.out.println("Idade do animal: "+p.getIdade());
		p.setEmiteSom(false);
		p.som();
		p.tipoDeSom();
		p.setSobe(true);
		p.escalar();
		

	}

}
