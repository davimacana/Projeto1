package br.com.java.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.java.dao.BibliotecaDAO;
import br.com.java.model.Biblioteca;

/**
 * @author Davi Maçana
 *
 */
public class BibliotecaDAOImpl implements BibliotecaDAO {

	@Inject
    private EntityManager em;
	
	@Override
	public Biblioteca consultaBiblioteca() {
		
		String sql = "select * from teste";
		Query query = em.createNativeQuery(sql);
		List<Object> teste = query.getResultList();
		
		return new Biblioteca();
	}

}
