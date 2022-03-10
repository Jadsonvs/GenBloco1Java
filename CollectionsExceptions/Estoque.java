package CollectionsExceptions;

public class Estoque implements Cadastro{

	private String nome;
	private int qtn;
	private int validade;
	
	public Estoque (String nome, int qtn, int validade)
	{
		this.nome = nome;
		this.qtn = qtn;
		this.validade = validade;
		
	}
	
	@Override
	public void insiraNome() {
		
		
	}
	@Override
	public void insiraQnt() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void valida() {
		// TODO Auto-generated method stub
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtn() {
		return qtn;
	}
	public void setQtn(int qtn) {
		this.qtn = qtn;
	}
	public int getValidade() {
		return validade;
	}
	public void setValidade(int validade) {
		this.validade = validade;
	}
	
	public String toString()
	{
		return "Nome: "+this.nome+"|"+"Quant: "+this.qtn+"|"+"Valid: "+this.validade;
	}
}
