import java.util.*;

public class Pack {

	ArrayList<Producto> productos;
	private int codigo =0;

	public Pack() {
		this.codigo++;
		productos = new ArrayList<Producto>();
	}


	public int getCodigo() {
		return codigo;
	}


	public void agregarProducto(Producto producto) {
		if (20 >= productos.size()) {
			System.out.println("Un pack no puede tener mas de 20 productos");;
		}
		else {
			productos.add(producto);
		}
	}

	public void eliminarProducto(int codigo) {
		for (Producto producto : productos){
			if (producto.getCodigo() == codigo) {
				productos.remove(producto);
			}
		}
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}



}