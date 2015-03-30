package prodAndes.vos;

import java.util.ArrayList;

public class ConsultaProducto {
	private String nombre;
	private int cantidad;
	private ArrayList<Componente> compuestoDe;
	private ArrayList<EtapaProduccion> proceso;
	private int enProduccion;
	private ArrayList<PedidoCliente> pedidosInvolucrados;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Componente> getCompuestoDe() {
		return compuestoDe;
	}
	public void setCompuestoDe(ArrayList<Componente> compuestoDe) {
		this.compuestoDe = compuestoDe;
	}
	public ArrayList<EtapaProduccion> getProceso() {
		return proceso;
	}
	public void setProceso(ArrayList<EtapaProduccion> proceso) {
		this.proceso = proceso;
	}
	public int getEnProduccion() {
		return enProduccion;
	}
	public void setEnProduccion(int enProduccion) {
		this.enProduccion = enProduccion;
	}
	public ArrayList<PedidoCliente> getPedidosInvolucrados() {
		return pedidosInvolucrados;
	}
	public void setPedidosInvolucrados(ArrayList<PedidoCliente> pedidosInvolucrados) {
		this.pedidosInvolucrados = pedidosInvolucrados;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}