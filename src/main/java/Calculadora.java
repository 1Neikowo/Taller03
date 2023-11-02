import java.util.ArrayList;
public class Calculadora {


	public long calcularValorTotal(Flete flete) {
		ArrayList<Pack> packs= flete.getPacks();
		long valorTotal=0;
		for(Pack pack: packs){
			ArrayList<Producto> productos= pack.getProductos();
			for(Producto producto: productos){
				valorTotal += producto.getValor();

			}
		} return valorTotal;
	}

}