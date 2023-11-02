import java.util.*;

public class Camion {

	private ArrayList<Flete> fletes;
	private int codigo=0;
	private String patente;
	private String descripcion;
	private boolean estado;
	public Flete getFlete(int codigo) {
		for (Flete f : fletes) {
			if (f.getCodigo() == codigo) {
				return f;
			}
		}return null;
	}
	public ArrayList<Flete> getFletes() {
		return fletes;
	}
	public int getCodigo() {
		return codigo;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Camion(String patente, String descripcion, boolean estado) {
		this.fletes = new ArrayList<Flete>();
		this.codigo++;
		this.patente = patente;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public void agregarFlete(Flete flete) {
		fletes.add(flete);
	}
	public void eliminarFlete(Flete flete) {
		for (int i = 0; i < fletes.size(); i++) {
			if (flete == fletes.get(i)){
				fletes.remove(fletes.get(i));
			}else{
				System.out.println("Flete no existente");
			}
		}
	}
}