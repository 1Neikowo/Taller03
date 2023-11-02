import java.util.*;

public class Pack {

	Collection<Producto> productos;
	private int codigo;

	public Pack(int codigo) {
		this.codigo = codigo;
		productos = new ArrayList<Producto>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void addProducto(Producto producto) {
		productos.add(producto);
	}

	public void removeProducto(Producto producto) {
		productos.remove(producto);
	}

	public Collection<Producto> getProductos() {
		return productos;
	}



}