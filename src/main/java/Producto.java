public class Producto {
	private int codigo = 0;
	private String tipo;



	public Producto(String tipo) {
		this.codigo++;
		this.tipo = tipo;
	}



	public int getCodigo() {
		return codigo;
	}


	public String setTipo(String tipo) {
		this.tipo = tipo;
		return tipo;
	}


	public String getTipo() {
		return tipo;

	}
}
