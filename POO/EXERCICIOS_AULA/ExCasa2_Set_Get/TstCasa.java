public class TstCasa{

	public static void main (String arg[]){

		Casa c = new Casa();
		Aluguel a = new Aluguel();
		
		System.out.println("\n\n\t===========ALUGSOFT===========");
		System.out.println("\n\t    -Seu sistema de locação-");
		

		c.setTipo("Alvenaria");
		c.setModelo("Sobrado");
		c.setComodos(4);
		c.setCor("Verde");
		c.setLocal("Periferia");
		
		a.setLocatario("Esdras");
		a.setLocador("UTFPR");
		a.setValor(2000);

		System.out.println ("\n\n\t---DADOS DA CASA---");
		System.out.println ("\n\nTipo.......: "+c.getTipo());	
		System.out.println ("Modelo.....: "+c.getModelo());
		System.out.println ("Localidade.: "+c.getLocal());
		System.out.println ("Comodos....: "+c.getComodos());
		System.out.println ("Cor........: "+c.getCor());		

		System.out.println("\n\t---DADOS DA LOCAÇAO---");		
		System.out.println("Locatario: "+a.getLocatario());
		System.out.println("Locador: "+a.getLocador());
		System.out.println("Valor: "+a.getValor());


	
		

		System.out.println ("\n\nALUGSOFT Agradece a preferência\n\n");
	}
}