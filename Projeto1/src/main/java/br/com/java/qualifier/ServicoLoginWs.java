package br.com.java.qualifier;

import java.util.logging.Logger;

import br.com.java.model.Usuario;

/**
 * Serviço de login que realiza a checagem de credenciais a partir de um Serviço WS.
 *
 * @author Davi Maçana
 */
public class ServicoLoginWs implements ServicoLogin {

	private static final Logger logger = Logger.getLogger(ServicoLoginWs.class.getCanonicalName());
	
	@Override
	public boolean fazerLogin(Usuario usuario) {
		logger.info("Realizando a operação de login via Serviço WS.");
	    return true;
	}

}
