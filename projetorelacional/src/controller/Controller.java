package controller;
import java.io.IOException; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import entity.Cliente; import entity.Endereco; 
import persistence.ClienteDao; @WebServlet("/Controller") 

public class Controller extends HttpServlet 
{ private static final long serialVersionUID = 1L; 


protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException { }protected void doPost(HttpServletRequest
				request, HttpServletResponse response) throws ServletException, IOException 
		
		
		{ try 
		
		{ Cliente c = new Cliente(null, request.getParameter("nome"), request.getParameter("email"));
		c.setEndereco(new Endereco(null, request.getParameter("logradouro"), request.getParameter("bairro"),
				request.getParameter("cidade"), request.getParameter("estado"), request.getParameter("cep"))); 
		new ClienteDao().create(c); request.setAttribute("msg", "Dados Gravados do Cliente Endereco"); 
		
		} catch (Exception ex) 
		
		{ request.setAttribute("msg", "Error :" + ex.getMessage()); } request.getRequestDispatcher("sistema.jsp").forward(request, response); } }