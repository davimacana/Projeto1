package br.com.java.bo.impl;

import javax.inject.Inject;

import br.com.java.bo.BibliotecaBO;
import br.com.java.dao.BibliotecaDAO;
import br.com.java.model.Biblioteca;

/**
 * @author Davi Maçana
 *
 */
public class BibliotecaBOImpl implements BibliotecaBO {

	@Inject
	private BibliotecaDAO bibliotecaDAO;
	
	@Override
	public Biblioteca consultaBiblioteca() {
		return bibliotecaDAO.consultaBiblioteca();
	}
}
