public class Casa{
	private String Tipo;
	private String Modelo;
	private String Local;
	private String Cor;
	private int Comodos;

	public void setTipo(String Tipo){
		this.Tipo = Tipo;		
	}

	public void setModelo(String Modelo){
		this.Modelo = Modelo;
	}
	
	public void setLocal(String Local){
		this.Local = Local;
	}

	public void setCor(String Cor){
		this.Cor = Cor;
	}

	public void setComodos(int Comodos){
		this.Comodos = Comodos;
	}

	public String getTipo(){
		return Tipo;		
	}

	public String getModelo(){
		return Modelo;
	}

	public String getLocal(){
		return Local;
	}

	public String getCor(){
		return Cor;
	}

	public int getComodos(){
		return Comodos;
	}		 
}