package br.com.java.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import br.com.java.model.Usuario;
import br.com.java.qualifier.QualificadorLogin;
import br.com.java.qualifier.ServicoLogin;

/**
 * @author Davi Maçana
 *
 * Servlet implementation class LoginController
 */
@SessionScoped
@WebServlet(description = "Servlet que realiza a autenticação.", name = "login" , urlPatterns = "/login")
public class LoginController extends HttpServlet implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Usuario usuario;
	
	@Inject
	@QualificadorLogin
	private transient ServicoLogin servicoLogin;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		usuario.setNome(request.getParameter("usuario"));
		usuario.setSenha(request.getParameter("senha"));
		
		if (StringUtils.isNotBlank(usuario.getNome()) && StringUtils.isNotBlank(usuario.getSenha())) {
			servicoLogin.fazerLogin(usuario);
			// Inserindo um atributo na sessão da aplicação
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario);
		}
		response.sendRedirect(request.getContextPath() + "/biblioteca");
	}
}
