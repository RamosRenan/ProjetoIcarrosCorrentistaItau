package com.icarros.constants;

public enum PrecendenceOperations {
	PARENTESES(0, '/'),
	MULTIPLICACAO(1, '*'),
	DIVISAO(2, '/'),
	SOMA(3, '+'),
	SUB(4, '-');
	
	private int id;
	private char c;
	
	PrecendenceOperations(int id, char c)
	{
		this.id = id;
		this.c = c;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public char getCharOperador()
	{
		return this.c;
	}
	
}// PrecendenceOperations
