package prodAndes.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prodAndes.fachada.ProdAndes;

public class ServletRF10 extends ServletTemplate {

	private static final long serialVersionUID = 1L;
	
	
	private ProdAndes prodAndes;

	@Override
	public void escribirContenido(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		PrintWriter respuesta = response.getWriter();
		String idEtapa = request.getParameter("idEtapa");
		String tiempoInicio = request.getParameter("tiempoInicio");
		String tiempoFinalizacion = request.getParameter("tiempoFinalizacion");
		
		ProdAndes actual = prodAndes.darInstancia();
		
		if(idEtapa!=null){
			try {
				//actual.registrarProduccion(idEtapa, tiempoFinalizacion);
				imprimirExito(response, "Se registro la ejecucion de etapa de produccion: " + idEtapa);
			} catch (Exception e) {
				e.printStackTrace();
				imprimirError(response, "Al registrar ejecucion de etapa de produccion: " + idEtapa);
			}
		}
		
	}
	
	
	
}
