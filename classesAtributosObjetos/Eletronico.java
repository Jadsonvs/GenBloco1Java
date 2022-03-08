/*
 Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
 em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as 
 informações deste objeto no console.
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
			System.out.println("Aparelho de botão");
		}
	}
	public void coneccao()
	{
		if(this.wifi==false)
		{
			System.out.println("Conecção via chip");
		}
		else
		{
			System.out.println("Conecção via wifi");
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
