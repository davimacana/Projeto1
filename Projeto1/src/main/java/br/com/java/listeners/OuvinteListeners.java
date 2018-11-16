package br.com.java.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Davi Maçana
 *
 */
@WebListener
public class OuvinteListeners implements ServletContextListener {

	/**
     * Método invocado ao criar o contexto da aplicação
     * 
     * @param sce the ServletContextEvent containing the ServletContext
     * that is being initialized
     *
     * @implSpec
     * The default implementation takes no action.
     */
	@Override
	public void contextInitialized(ServletContextEvent sce) {}
	
	/**
     * Método invocado ao destruir o contexto da aplicação
     * 
     * @param sce the ServletContextEvent containing the ServletContext
     * that is being initialized
     *
     * @implSpec
     * The default implementation takes no action.
     */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {}
}
