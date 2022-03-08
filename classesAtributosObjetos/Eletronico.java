/*
 Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
 em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as 
 informa��es deste objeto no console.
 */

package classesAtributosObjetos;

public class Eletronico {
	
	boolean touch;
	boolean atual;
	boolean wifi;
	int valor;
	
	public void interacao()
	{
		if(this.touch==true)
		{
			System.out.println("Aparelho touchscreen");
		}
		else
		{
			System.out.println("Aparelho de bot�o");
		}
	}
	public void coneccao()
	{
		if(this.wifi==false)
		{
			System.out.println("Conec��o via chip");
		}
		else
		{
			System.out.println("Conec��o via wifi");
		}
	}
	public void venda()
	{
		if(this.valor<=500)
		{
			System.out.println("Aparelho com valor adequado");
		}
		else
		{
			System.out.println("Valor muitio alto para o mercado");
		}
	}
}
