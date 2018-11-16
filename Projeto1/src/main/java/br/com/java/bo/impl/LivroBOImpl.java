package br.com.java.bo.impl;

import javax.inject.Inject;

import br.com.java.bo.LivroBO;
import br.com.java.dao.LivroDAO;
import br.com.java.model.Livro;

/**
 * @author Davi Maçana
 *
 */
public class LivroBOImpl implements LivroBO {

	@Inject
	private LivroDAO livroDAO;
	
	@Override
	public Livro consultaLivro(String isbn) {
		return livroDAO.consultaLivro(isbn);
	}

}
