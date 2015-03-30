package prodAndes.vos;

public class MateriaPrima {
	
	private String id;
	
	private String nombre;
	
	private String unidad;
	
	private int cantidad;
	
	public MateriaPrima(){
		
	}

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

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
}
