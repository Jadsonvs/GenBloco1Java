package classesAtributosObjetos;

public class ObjetoAviao {

	public static void main(String[] args) {
		
		Aviao meuAviao = new Aviao();
		
		meuAviao.modelo = "Boing";
		meuAviao.fabricante = "Tam";
		meuAviao.ano = 1994;
		meuAviao.voando = false;
		meuAviao.valor = 10000;

		System.out.println("----Catalogo de compra----");
		meuAviao.tempo();
		meuAviao.operando();
		meuAviao.compra();
	}

}
