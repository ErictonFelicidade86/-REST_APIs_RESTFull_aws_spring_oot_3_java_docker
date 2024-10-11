package br.am.ericton.math;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class SimpleMath {
	
	public Double sum(Double numberOne, Double numberTwo){
		return numberOne + numberTwo;
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public Double Multiplication(Double numberOne, Double numberTwo){
		return numberOne * numberTwo;
	}
	
	public Double Mean(Double numberOne, Double numberTwo){
		return (numberOne + numberTwo) /2;
	}
	
	@RequestMapping(value = "/squareRoot/{number}", method=RequestMethod.GET)
	public Double squareRoot(Double number){
		return Math.sqrt(number);
	}

}
