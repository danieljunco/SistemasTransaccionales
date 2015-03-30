package prodAndes.vos;
public class EtapaProduccion {
	
	private String id;
	
	private int num_etapa;
	
	private String descripcion;
	
	private String idProd;
	
	private String idComp;
	
	private int cantidad;

	public int getNombre() {
		return num_etapa;
	}

	public void setNombre(int nombre) {
		this.num_etapa = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdProd() {
		return idProd;
	}

	public void setIdProd(String idProd) {
		this.idProd = idProd;
	}

	public String getIdComp() {
		return idComp;
	}

	public void setIdComp(String idComp) {
		this.idComp = idComp;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
