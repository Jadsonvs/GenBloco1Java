/*
 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
    em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es
    deste objeto no console.
 */

package classesAtributosObjetos;

public class Aviao {
	String modelo, fabricante;
	int ano;
	double  valor;
	boolean voando;
	

public void operando()
{
	if(this.voando==true)
	{
		System.out.println("Avi�o voando e em perfeito estado!");
	}
	else 
	{
		System.out.println("Avi�o fora de opera��o");
	}
}

public void tempo()
{
	if(this.ano<2000)
	{
		System.out.println("Avi�o muito antigo!");
	}
	else
	{
		System.out.println("Avi�o novo");
	}

}

public void compra()
{
	if(this.valor>1000000)
	{
		System.out.println("Avi�o muito caro!");
	}
	else
	{
		System.out.println("Valor dentro do or�amento da aviac�o!");
	}
}



}