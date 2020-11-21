package com.teste;

public class Calculadora {

	public int somar(String expression) {
		int soma  = 0;
		for(String valorSoma : expression.split("\\+"))
			soma += Integer.valueOf(valorSoma);
		
		System.out.println(soma);
		return soma;
	}
}
