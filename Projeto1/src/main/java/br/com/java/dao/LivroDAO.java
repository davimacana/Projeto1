package br.com.java.dao;

import br.com.java.model.Livro;

/**
 * @author Davi Maçana
 *
 */
public interface LivroDAO {

	Livro consultaLivro(String isbn);
}
