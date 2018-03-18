public class Aluguel{


	static String locatario;
	static String locador;
	static int valor;

	void cadAluguel(Aluguel a){

		Aluguel a1 = new Aluguel();
		
		a1.locatario = "Esdras";
		a1.locador = "UTFPR";
		a1.valor = 2000;
	}

	void impAluguel(Aluguel a){
	
		System.out.println("\n\t---DADOS DA LOCAÇAO---");		
		System.out.println("\nLocatario: "+a.locatario);
		System.out.println("Locatador: "+a.locador);
		System.out.println("Valor: "+a.valor);
	}
}