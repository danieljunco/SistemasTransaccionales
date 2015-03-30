package prodAndes.vos;

import java.util.ArrayList;

public class ConsultaMateria {
	private String nombre;
	
	private int cantidad;
	
	private String um;
	
	private ArrayList<Componente> compone;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	public ArrayList<Componente> getCompone() {
		return compone;
	}

	public void setCompone(ArrayList<Componente> compone) {
		this.compone = compone;
	}
}
