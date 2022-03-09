package encapsulamentoHerancaPolimorfismo;

public class Cachorro extends Animal {

		private boolean corre;
	
		@Override
		public void tipoDeSom ()
		{
			System.out.println("Tipo de som: latido");
		}
		
		
		public void acao()
		{
			if(this.corre==true)
			{
				System.out.println("Animal corre");
			}
			else
			{
				System.out.println("Animal não corre");
			}
		}

		public boolean getCorre() {
			return corre;
		}

		public void setCorre(boolean corre) {
			this.corre = corre;
		}
		
}
