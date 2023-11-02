import java.util.ArrayList;

public class Empresa {

	ArrayList<Sucursal> sucursales;
	private String nombre;
	private String direccion;

	public Empresa(String nombre, String direccion){
		this.sucursales = new ArrayList<Sucursal>();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public void agregarSucursal(Sucursal sucursal) {
		sucursales.add(sucursal);
	}
	public void eliminarSucursal(int codigo) {
		for(Sucursal sucursal: sucursales){
			if(sucursal.getCodigo() == codigo){
				sucursales.remove(sucursal);
			}
		}
	}

}