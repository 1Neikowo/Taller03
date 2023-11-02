import java.util.ArrayList;

public class Sucursal {

	ArrayList<Camion> camiones;
	private int codigo;
	private String region;

	public Sucursal(int codigo, String region){
		this.camiones = new ArrayList<Camion>();
		this.codigo = codigo;
		this.region=region;
	}
	public void agregarCamion(Camion camion) {
		camiones.add(camion);
	}


	public void eliminarCamion(int codigo) {
		for(Camion camion: camiones){
			if(camion.getCodigo() == codigo){
				camiones.remove(camion);
			}
		}
	}


	public void modificarEstado(int codigo, boolean estado) {
		for(Camion camion: camiones){
			if(camion.getCodigo() == codigo){
				camion.setEstado(estado);
			}
		}
	}


}