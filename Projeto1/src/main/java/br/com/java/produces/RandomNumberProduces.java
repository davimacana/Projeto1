package br.com.java.produces;

import javax.enterprise.inject.Produces;

/**
 * @author Davi Maçana
 *
 */
public class RandomNumberProduces {

	@Produces 
	public RandomNumberGenerator getRandomNumber() {
		return new RandomNumberGenerator(100);
	}
}
