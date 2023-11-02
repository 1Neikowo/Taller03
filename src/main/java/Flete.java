import java.util.*;

public class Flete {

	private ArrayList<Pack> packs;
	private int codigo =0;
	private String descripcion;

	public Flete(Pack pack, String descripcion) {
		this.packs = new ArrayList<Pack>();
		packs.add(pack);
		this.codigo++;
		this.descripcion = descripcion;
	}
	public void agregarPack(Pack pack){
		if (packs.size() <=5){
			packs.add(pack);
		}else{
			System.out.println("El flete está lleno");
		}
	}
	public void eliminarPack(Pack pack){
		if (packs.size() > 1){
			packs.remove(pack);
		}else{
			System.out.println("El flete no puede estar vacío");
		}
	}
}