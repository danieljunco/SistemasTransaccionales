package prodAndes.vos;

import java.sql.Date;

public class PedidoProveedor {
	private String idPedido;

	private String proveedor;

	private int estado;

	private Date fecha;

	private Date fechaEnt;

	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaEnt() {
		return fechaEnt;
	}

	public void setFechaEnt(Date fechaEnt) {
		this.fechaEnt = fechaEnt;
	}
}
