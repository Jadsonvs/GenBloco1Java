package encapsulamentoHeranca;

public class Preguica extends Animal{

	private boolean sobe;
	
	public void escalar()
	{
		if(this.sobe==true)
		{
			System.out.println("Animal sobe �rvore");
		}
		else
		{
			System.out.println("Animal n�o sobe �rvore");
		}
	}

	public boolean isSobe() {
		return sobe;
	}

	public void setSobe(boolean sobe) {
		this.sobe = sobe;
	}
	
}
