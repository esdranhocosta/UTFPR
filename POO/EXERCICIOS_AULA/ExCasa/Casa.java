public class Casa{

	static String tipo;
	static String modelo;
	static String local;
	static int comodos;
	static String cor;
	
	

	public void Entrada(Casa c){
		
		Casa h = new Casa();	
	
		h.tipo = "Alvenaria";
		h.modelo = "Sobrado";
		h.comodos = 4;
		h.cor = "Verde";
		h.local = "Periferia";
		
	}

	public void ImprimiCasa(Casa c){
	
		Casa m = new Casa();

		System.out.println ("\n\n\t---DADOS DA CASA---");
		System.out.println ("\n\nTipo.......: "+c.tipo);	
		System.out.println ("Modelo.....: "+c.modelo);
		System.out.println ("Localidade.: "+c.local);
		System.out.println ("Comodos....: "+c.comodos);
		System.out.println ("Cor........: "+c.cor);
	}		 
}