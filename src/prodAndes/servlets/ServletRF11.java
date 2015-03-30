package prodAndes.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prodAndes.fachada.ProdAndes;


public class ServletRF11 extends ServletTemplate {

	private static final long serialVersionUID = 1L;
	
	private ProdAndes prodAndes;
	@Override
	public void escribirContenido(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		
		
		String idMaterial=request.getParameter("idMaterial");
		String fechaLlegada = request.getParameter("fechaLlegada");
		String cantidad = request.getParameter("cantidad");
		
		

		ProdAndes actual= prodAndes.darInstancia();

		if(idMaterial!=null){
				try {
					//!!!!! CAMBIELO REGISTRARLLEGADAMATERIAL LE DEBE ENTRAR POR PARAMETRO ESO: ID, FECHA, CANTIDAD
					//actual.registrarLlegadaMaterial(idMaterial);
					imprimirExito(response, "Se registro la llegada del Material con ID: " + idMaterial);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					imprimirError(response, "Al registrar llegada de Material con ID: " + idMaterial);
				}
		
		}
		
	}

}
