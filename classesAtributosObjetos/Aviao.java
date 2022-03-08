/*
 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações
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
		System.out.println("Avião voando e em perfeito estado!");
	}
	else 
	{
		System.out.println("Avião fora de operação");
	}
}

public void tempo()
{
	if(this.ano<2000)
	{
		System.out.println("Avião muito antigo!");
	}
	else
	{
		System.out.println("Avião novo");
	}

}

public void compra()
{
	if(this.valor>1000000)
	{
		System.out.println("Avião muito caro!");
	}
	else
	{
		System.out.println("Valor dentro do orçamento da aviacão!");
	}
}



}