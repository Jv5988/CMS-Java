package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import model.Cliente;

@WebServlet("/CreateAndFind")
public class ClienteCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClienteCreateAndFind() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		 System.out.println(pesquisa);

		
		if(pesquisa == null) {
			pesquisa = "";
		}
		 ClienteDAO clienteDAO = new ClienteDAO();
				 
		List<Cliente> clientes = clienteDAO.find(pesquisa);
		
		request.setAttribute("clientes", clientes);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("lista.jsp");
		requestDispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String nascimento = request.getParameter("nascimento");
		String situacao = request.getParameter("situacao");
		
		Cliente cliente = new Cliente(nome, cpf, nascimento, situacao);
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.create(cliente);
		
		response.sendRedirect("index.jsp");
	
		
	}

}
