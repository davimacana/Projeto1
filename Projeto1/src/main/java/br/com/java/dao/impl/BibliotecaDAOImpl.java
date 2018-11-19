package br.com.java.dao.impl;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.java.dao.BibliotecaDAO;
import br.com.java.model.Biblioteca;
import br.com.java.model.Livro;

/**
 * @author Davi Maçana
 *
 */
public class BibliotecaDAOImpl implements BibliotecaDAO {

	@Inject
    private EntityManager em;
	
	@Override
	public Biblioteca consultaBiblioteca() {
		String sql = "select * from livro";
		Query query = em.createNativeQuery(sql);
		List<Object[]> lista = query.getResultList();
		Iterator<Object[]> itr = lista.iterator();
		Biblioteca biblioteca = new Biblioteca();
		while (itr.hasNext()) {
			Object[] obj = (Object[]) itr.next();
			Livro livro = new Livro();
			livro.setId((int) obj[0]);
			livro.setTitulo((String) obj[1]);
			livro.setIsbn((String) obj[2]);
			livro.setIdioma((String) obj[3]);
			biblioteca.getLivros().add(livro);
		}
		return biblioteca;
	}

}
