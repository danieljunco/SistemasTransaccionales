package prodAndes.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prodAndes.fachada.ProdAndes;

public class ServletRF12 extends ServletTemplate {

private static final long serialVersionUID = 1L;
	
	private ProdAndes prodAndes;
	@Override
	public void escribirContenido(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		
		
		String idProducto=request.getParameter("idProducto");
		String cantidad = request.getParameter("cantidad");
		String fechaEsperada = request.getParameter("fechaEsperada");
		

		ProdAndes actual= prodAndes.darInstancia();

		if(idProducto!=null){
				try {
					//ARREGLAR METODO !!! le debe entrar la fecha y cantidad 
					//actual.registrarLlegadaMaterial(idMaterial);
					imprimirExito(response, "Se registro su pedido del producto: "+idProducto);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					imprimirError(response, "Al registrar pedido: " + idProducto);
				}
		
		}
	}
}
