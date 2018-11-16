package br.com.java.dao.impl;

import br.com.java.dao.LivroDAO;
import br.com.java.model.Biblioteca;
import br.com.java.model.Livro;

/**
 * @author Davi Maçana
 *
 */
public class LivroDAOImpl implements LivroDAO {

	@Override
	public Livro consultaLivro(String isbn) {
		Biblioteca biblioteca = new Biblioteca();
		return biblioteca.getLivro(isbn);
	}

}
