package prodAndes.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prodAndes.fachada.ProdAndes;

public class ServletProductos extends ServletTemplate {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void escribirContenido(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		try {
			PrintWriter respuesta = response.getWriter();
			ArrayList<String> nombres = ProdAndes.darInstancia().consultarNombreProductos();
			respuesta.println("<div class=\"row\">");
			respuesta.println("                    <div class=\"col-lg-4\">");
			respuesta.println("");
			respuesta.println("                        ");
			respuesta.println("");
			respuesta.println("                    </div>");
			respuesta.println("                    <div class=\"col-lg-4\">");
			respuesta.println("                    <form role=\"form\" action=\"ServletTablasProductos.htm\" method=\"get\">");
			respuesta.println("");
			respuesta.println("                            <div class=\"form-group\">");
			respuesta.println("                            	<h2>Seleccionar Material</h2>");
			respuesta.println("                            	<select class=\"form-control\" name=\"nombreProducto\" required>");
			respuesta.println("                            	<option value=\"\" disabled selected> Sel. Producto </option>");
			for (int i = 0; i < nombres.size(); i++) {
				String nombre = nombres.get(i);
				respuesta.println("                            	<option value=\""+nombre+"\">"+nombre+"</option>");
			}
			respuesta.println("                            	</select>");
			respuesta.println("                                ");
			respuesta.println("					</div>");
			respuesta.println("");
			respuesta.println("                            <button type=\"submit\" class=\"btn btn-primary\">Consultar</button>");
			respuesta.println("                            <button type=\"reset\" class=\"btn btn-primary\">Reset</button>");
			respuesta.println("");
			respuesta.println("                        </form>");
			respuesta.println("                    </div>");
			respuesta.println("                    ");
			respuesta.println("                </div>");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	

}
