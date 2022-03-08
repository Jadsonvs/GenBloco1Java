package encapsulamentoHeranca;

public class Preguica extends Animal{

	private boolean sobe;
	
	public void escalar()
	{
		if(this.sobe==true)
		{
			System.out.println("Animal sobe árvore");
		}
		else
		{
			System.out.println("Animal não sobe árvore");
		}
	}

	public boolean isSobe() {
		return sobe;
	}

	public void setSobe(boolean sobe) {
		this.sobe = sobe;
	}
	
}
