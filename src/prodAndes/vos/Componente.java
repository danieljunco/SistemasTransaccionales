package prodAndes.vos;
public class Componente {
	
	private String id;
	
	private String nombre;
	
	private int cantidad;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int stock) {
		this.cantidad = stock;
	}
}
