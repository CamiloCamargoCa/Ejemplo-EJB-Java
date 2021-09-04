package cliente;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servidor.Servidor;

@WebServlet(urlPatterns = "/consultar")
public class Cliente extends HttpServlet{
	
	private static final long serialVersionUID = -2646491165890456217L;
	@EJB private Servidor servicio;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cod=Integer.parseInt(req.getParameter("cod"));
		PrintWriter pw = resp.getWriter();
		
		String[] resultado = servicio.consultar(cod);
		pw.println("<html>");
		
		pw.println("<head>");
		pw.println("<title>Aplicacion Cliente</title>");
		pw.println("</head>");
		
		pw.println("<body style=background-color:#f2f2df>");
		
		pw.println("<div style=display:block;margin-left:auto;margin-right:auto;width:500px>");
		pw.println("<h1> Datos del Empleado <h1>");
		
		pw.println(resultado[0]);
		pw.println("<h3>"+resultado[1]+"<h3>");
		pw.println("<h3>"+resultado[2]+"<h3>");
		pw.println("<h3>"+resultado[3]+"<h3>");
		pw.println("<h3>"+resultado[4]+"<h3>");
		
		pw.println("</div>");
		
		pw.println("</body>");
		pw.println("</html>");
		
		pw.flush();
		pw.close();
		
	}
}
