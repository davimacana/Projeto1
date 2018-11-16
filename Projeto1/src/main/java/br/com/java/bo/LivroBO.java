package br.com.java.bo;

import br.com.java.model.Livro;

/**
 * @author Davi Maçana
 *
 */
public interface LivroBO {
	
	Livro consultaLivro(String isbn);
	
}
