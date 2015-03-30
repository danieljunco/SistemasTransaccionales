package prodAndes.vos;

public class Proveedor extends Usuario {
	
	private int cargaMax;
	
	private String tiempoEntrega;

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public String getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(String tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}
}
