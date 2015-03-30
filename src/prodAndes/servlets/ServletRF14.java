package prodAndes.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prodAndes.fachada.ProdAndes;

public class ServletRF14 extends ServletTemplate {
	
	private static final long serialVersionUID = 1L;

	private ProdAndes prodAndes;
	@Override
	public void escribirContenido(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		
		
		String idPedido=request.getParameter("idPedido");
		
		ProdAndes actual= prodAndes.darInstancia();

		if(idPedido!=null){
				try {
					//ARREGLAR METODO !!!  
					actual.registrarEntregaPedido(idPedido);
					imprimirExito(response, "Se registro la entrega de pedido: "+idPedido);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					imprimirError(response, "Al registrar la entrega del pedido: " + idPedido);
				}
		
		}
	}
}
