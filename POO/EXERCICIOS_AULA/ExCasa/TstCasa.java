public class TstCasa{

	public static void main (String arg[]){

		Casa c = new Casa();
		Aluguel a = new Aluguel();
		
		System.out.println("\n\n\t===========ALUGSOFT===========");
		System.out.println("\n\t    -Seu sistema de loca��o-");
		c.Entrada(c);
		c.ImprimiCasa(c);
		a.cadAluguel(a);
		a.impAluguel(a);
		

		System.out.println ("\n\nALUGSOFT Agradece a prefer�ncia\n\n");
	}
}