package prodAndes.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prodAndes.fachada.ProdAndes;

public abstract class ServletTemplate extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * constructor de la clase. Llama al constructor de 
     * su padre.
     */
    public ServletTemplate() {
        super();

    }
    
    /**
	 * Recibe la solicitud y la herramienta de respuesta a las solicitudes
	 * hechas por los mtodos get. Invoca el mtodo procesarPedido.
	 * @param request pedido del cliente
	 * @param response respuesta del servlet
	 * @throws IOException Excepcin de error al escribir la respuesta
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		procesarPedido(request, response);
	}

	/**
	 * Recibe la solicitud y la herramienta de respuesta a las solicitudes
	 * hechas por los mtodos post. Invoca el mtodo procesarPedido.
	 * @param request pedido del cliente
	 * @param response respuesta del servlet
	 * @throws IOException Excepcin de error al escribir la respuesta
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		procesarPedido(request, response);
	}
	
	/**
     * Procesa el pedido de igual manera para todos
     * @param request Pedido del cliente
     * @param response Respuesta del servlet
     * @throws IOException Excepcin de error al escribir la respuesta
     */
    private void procesarPedido( HttpServletRequest request, HttpServletResponse response ) throws IOException
    {
    	ProdAndes.darInstancia().inicializarRuta();
        imprimirHeader( request, response );
        escribirContenido( request, response );
        imprimirFooter( response );
    }
    
    /**
     * Escribe la cabecera de la pgina web
     * @param request pedido del cliente
     * @param response respuesta del servlet
     * @throws IOException Excepcin de error al recibir la respuesta
     */
	private void imprimirHeader(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter respuesta = response.getWriter();
		
		respuesta.println("<!DOCTYPE html>");
		respuesta.println("<html lang=\"en\">");
		respuesta.println("");
		respuesta.println("<head>");
		respuesta.println("");
		respuesta.println("    <meta charset=\"utf-8\">");
		respuesta.println("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		respuesta.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		respuesta.println("    <meta name=\"description\" content=\"\">");
		respuesta.println("    <meta name=\"author\" content=\"\">");
		respuesta.println("");
		respuesta.println("    <title>ProdAndes</title>");
		respuesta.println("");
		respuesta.println("    <!-- Bootstrap Core CSS -->");
		respuesta.println("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">");
		respuesta.println("");
		respuesta.println("    <!-- Custom CSS -->");
		respuesta.println("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">");
		respuesta.println("");
		respuesta.println("    <!-- Morris Charts CSS -->");
		respuesta.println("    <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">");
		respuesta.println("");
		respuesta.println("    <!-- Custom Fonts -->");
		respuesta.println("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">");
		respuesta.println("");
		respuesta.println("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->");
		respuesta.println("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->");
		respuesta.println("    <!--[if lt IE 9]>");
		respuesta.println("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>");
		respuesta.println("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>");
		respuesta.println("    <![endif]-->");
		respuesta.println("");
		respuesta.println("</head>");
		respuesta.println("");
		respuesta.println("<body>");
		respuesta.println("");
		respuesta.println("    <div id=\"wrapper\">");
		respuesta.println("");
		respuesta.println("        <!-- Navigation -->");
		respuesta.println("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">");
		respuesta.println("            <!-- Brand and toggle get grouped for better mobile display -->");
		respuesta.println("            <div class=\"navbar-header\">");
		respuesta.println("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">");
		respuesta.println("                    <span class=\"sr-only\">Toggle navigation</span>");
		respuesta.println("                    <span class=\"icon-bar\"></span>");
		respuesta.println("                    <span class=\"icon-bar\"></span>");
		respuesta.println("                    <span class=\"icon-bar\"></span>");
		respuesta.println("                </button>");
		respuesta.println("                <a class=\"navbar-brand\" href=\"index.htm\">ProdAndes</a>");
		respuesta.println("            </div>");
		respuesta.println("            <!-- Top Menu Items -->");
		respuesta.println("            <ul class=\"nav navbar-right top-nav\">                ");
		respuesta.println("                <li class=\"dropdown\">");
		respuesta.println("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> Administrador <b class=\"caret\"></b></a>");
		respuesta.println("                    <ul class=\"dropdown-menu\">");
		respuesta.println("                        <li>");
		respuesta.println("                            <a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Profile</a>");
		respuesta.println("                        </li>");
		respuesta.println("                        <li>");
		respuesta.println("                            <a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i> Inbox</a>");
		respuesta.println("                        </li>");
		respuesta.println("                        <li>");
		respuesta.println("                            <a href=\"#\"><i class=\"fa fa-fw fa-gear\"></i> Settings</a>");
		respuesta.println("                        </li>");
		respuesta.println("                        <li class=\"divider\"></li>");
		respuesta.println("                        <li>");
		respuesta.println("                            <a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Log Out</a>");
		respuesta.println("                        </li>");
		respuesta.println("                    </ul>");
		respuesta.println("                </li>");
		respuesta.println("            </ul>");
		respuesta.println("            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->");
		respuesta.println("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">");
		respuesta.println("                <ul class=\"nav navbar-nav side-nav\">");
		respuesta.println("                    <li class=\"active\">");
		respuesta.println("                        <a href=\"index.htm\"><i class=\"fa fa-fw fa-dashboard\"></i> Dashboard</a>");
		respuesta.println("                    </li>");
		respuesta.println("                    <li>");
		respuesta.println("                        <a href=\"RFC1.html\"><i class=\"fa fa-fw fa-table\"></i> Consultar Las Existencias</a>");
		respuesta.println("                    </li>");
		respuesta.println("                    <li>");
		respuesta.println("                        <a href=\"ServletProductos.htm\"><i class=\"fa fa-fw fa-table\"></i>Consultar Material </a>");
		respuesta.println("                    </li>");
		respuesta.println("                    <li>");
		respuesta.println("                        <a href=\"RF10.html\"><i class=\"fa fa-fw fa-edit\"></i> Registrar Ejecucion Etapa Produccion</a>");
		respuesta.println("                    </li>");
		respuesta.println("                    <li>");
		respuesta.println("                        <a href=\"RF11.html\"><i class=\"fa fa-fw fa-edit\"></i> Registrar Llegada de Material</a>");
		respuesta.println("                    </li>");
		respuesta.println("                    <li>");
		respuesta.println("                        <a href=\"RF12.html\"><i class=\"fa fa-fw fa-edit\"></i> Registrar Pedido Productos</a>");
		respuesta.println("                    </li>");
		respuesta.println("                    <li>");
		respuesta.println("                        <a href=\"RF14.html\"><i class=\"fa fa-fw fa-edit\"></i> Registrar Entrega de Pedidos</a>");
		respuesta.println("                    </li>");
		respuesta.println("                    <li>");
		respuesta.println("                        <a href=\"blank-page.html\"><i class=\"fa fa-fw  fa-table\"></i> Bono 1</a>");
		respuesta.println("                        <li>");
		respuesta.println("                        <a href=\"blank-page.html\"><i class=\"fa fa-fw  fa-table\"></i> Bono 2</a>");
		respuesta.println("                    </li>                      ");
		respuesta.println("                </ul>");
		respuesta.println("            </div>");
		respuesta.println("            <!-- /.navbar-collapse -->");
		respuesta.println("        </nav>");
		respuesta.println("");
		respuesta.println("        <div id=\"page-wrapper\">");
		respuesta.println("");
		respuesta.println("            <div class=\"container-fluid\">");

	}

	/**
	 * 
	 * @param response
	 * @throws IOException
	 */
	private void imprimirFooter(HttpServletResponse response) throws IOException
	{
		PrintWriter respuesta = response.getWriter();
		
		respuesta.println("<!-- /.row -->");
		respuesta.println("");
		respuesta.println("            </div>");
		respuesta.println("            <!-- /.container-fluid -->");
		respuesta.println("");
		respuesta.println("        </div>");
		respuesta.println("        <!-- /#page-wrapper -->");
		respuesta.println("");
		respuesta.println("    </div>");
		respuesta.println("    <!-- /#wrapper -->");
		respuesta.println("");
		respuesta.println("    <!-- jQuery -->");
		respuesta.println("    <script src=\"js/jquery.js\"></script>");
		respuesta.println("");
		respuesta.println("    <!-- Bootstrap Core JavaScript -->");
		respuesta.println("    <script src=\"js/bootstrap.min.js\"></script>");
		respuesta.println("");
		respuesta.println("</body>");
		respuesta.println("");
		respuesta.println("</html>");

	}
	
	/**
	 * 
	 * @param response
	 * @throws IOException
	 */
	public void imprimirExito (HttpServletResponse response, String mensaje) throws IOException{
		PrintWriter respuesta = response.getWriter();
		
		respuesta.println("<div class=\"row\">");
		respuesta.println("                    <div class=\"col-lg-12\">");
		respuesta.println("                        <h1 class=\"page-header\">");
		respuesta.println("                            Operacion Exitosa:");
		respuesta.println("                        </h1>");
		respuesta.println("                        <h2>");
		respuesta.println("                        "+mensaje+"");
		respuesta.println("                        </h2>");
		respuesta.println("<ol class=\"breadcrumb\">");
		respuesta.println("                            <li>");
		respuesta.println("                                <i class=\"fa fa-dashboard\"></i>  <a href=\"index.htm\">Dashboard</a>");
		respuesta.println("                        </ol>");
		respuesta.println("                        </div>");
		respuesta.println("                        </div>");
		
	}
	
	public void imprimirError (HttpServletResponse response, String mensaje) throws IOException{
		PrintWriter respuesta = response.getWriter();
		
		respuesta.println("<div class=\"row\">");
		respuesta.println("                    <div class=\"col-lg-12\">");
		respuesta.println("                        <h1 class=\"page-header\">");
		respuesta.println("                            Error:");
		respuesta.println("                        </h1>");
		respuesta.println("                        <h2>");
		respuesta.println("                        "+mensaje+"");
		respuesta.println("                        </h2>");
		respuesta.println("<ol class=\"breadcrumb\">");
		respuesta.println("                            <li>");
		respuesta.println("                                <i class=\"fa fa-dashboard\"></i>  <a href=\"index.htm\">Dashboard</a>");
		respuesta.println("                        </ol>");
		respuesta.println("                        </div>");
		respuesta.println("                        </div>");

	}
	
    /**
     * Escribe el contenido de la pgina
     * @param request Pedido del cliente
     * @param response Respuesta
     * @throws IOException Excepcin de error al escribir la respuesta
     */
    public abstract void escribirContenido( HttpServletRequest request, HttpServletResponse response ) throws IOException;
}