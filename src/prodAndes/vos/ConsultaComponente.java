package prodAndes.vos;
import java.util.ArrayList;

public class ConsultaComponente {
	private String nombre;
	private ArrayList<MateriaPrima> compuestoDe;
	private ArrayList<EtapaProduccion> etapas;
	private int cantidad;
	private ArrayList<PedidoProveedor> pedidos;
	private ArrayList<Producto> compone;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<MateriaPrima> getCompuestoDe() {
		return compuestoDe;
	}
	public void setCompuestoDe(ArrayList<MateriaPrima> compuestoDe) {
		this.compuestoDe = compuestoDe;
	}
	public ArrayList<EtapaProduccion> getEtapas() {
		return etapas;
	}
	public void setEtapas(ArrayList<EtapaProduccion> etapas) {
		this.etapas = etapas;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public ArrayList<PedidoProveedor> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<PedidoProveedor> pedidos) {
		this.pedidos = pedidos;
	}
	public ArrayList<Producto> getCompone() {
		return compone;
	}
	public void setCompone(ArrayList<Producto> compone) {
		this.compone = compone;
	}
}
