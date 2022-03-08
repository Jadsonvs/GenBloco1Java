/*
 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
 informações deste objeto no console.
 */

package classesAtributosObjetos;

public class Cliente {
	
	String nome;
	int idade;
	String endereco;
	
	
	public void idade()
	{
		if(this.idade<18)
		{
			System.out.println("Cliente menor de 18 anos, impossível cadastro");
		}
	}
	
	public void cadastro()
	{
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Endereço: "+endereco);
	}
	
}
