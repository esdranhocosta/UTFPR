public class Aluguel{


	private String Locatario;
	private String Locador;
	private int Valor;

	

	public void setLocatario(String Locatario){
		this.Locatario = Locatario;
	}
	
	public void setLocador(String Locador){
		this.Locador = Locador;
	}
	public void setValor(int Valor){
		this.Valor = Valor;
	}

	public String getLocatario(){
		return Locatario;
	}
	
	public String getLocador(){
		return Locador;
	}
	public int getValor(){
		return Valor;
	}
	
}