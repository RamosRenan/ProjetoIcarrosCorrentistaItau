package com.icarros.controller;

import java.util.ArrayList;
import java.util.Iterator;

import com.icarros.components.CalcJtexts;
import com.icarros.constants.PrecendenceOperations;

public class Operacao {

	private String operacaoString;

	public Operacao() {
	}

	public void putTextIntoJTextFieldScreen(String string) {
		CalcJtexts.jTextArea.setText(CalcJtexts.jTextArea.getText() + string);
		this.operacaoString = CalcJtexts.jTextArea.getText();
		// System.out.println("--> Enum: "+PrecendenceOperations.PARENTESES.getId()+"
		// "+PrecendenceOperations.PARENTESES.name());
	}

	public float getResult() {
		String[] splitStringToChar = this.operacaoString.split("\\+|-|\\*|\\/");
		String[] splitStringToNumber = this.operacaoString.split("[.0-9]");

		int jj = 0;
		for (int i = 0; i < splitStringToNumber.length; i++) {
			if (!splitStringToNumber[i].isBlank()) {
				jj++;
			}
		}

		String[] removeBlank = new String[jj];

		jj = 0;

		for (int i = 0; i < splitStringToNumber.length; i++) {
			if (!splitStringToNumber[i].isBlank()) {
				removeBlank[jj] = splitStringToNumber[i];
				jj++;
			}
		}

		ArrayList<String> sequencia = new ArrayList<String>();
		
		for (int i = 0; i < splitStringToChar.length; i++) {
			
			sequencia.add(splitStringToChar[i]);
			if (i < removeBlank.length) {
				sequencia.add(removeBlank[i]);
			}
		}
		
		PrecendenceOperations[] charPrecendenceOperations = PrecendenceOperations.values();
		
		boolean sair = true;
		int k = 0;
		while(k < charPrecendenceOperations.length)
		{
			for (String string : sequencia) {
				 if(string.equals(String.valueOf(charPrecendenceOperations[k].getCharOperador())))
				 {
					 System.out.println("--> Operador: "+string);
					 float num1 = Float.valueOf(sequencia.get(sequencia.indexOf(string) - 1));
					 float num2 = Float.valueOf(sequencia.get(sequencia.indexOf(string) + 1));
					 
					 System.out.println("--> num1: "+num1+" num2: "+num2);
					 
					 float resp = resp(num1, num2, charPrecendenceOperations[k].getCharOperador());
					 
					 System.out.println("--> index do operador: "+sequencia.indexOf(string));
					 System.out.println("--> REsposta : "+resp);
					 
					 int removeNext = sequencia.indexOf(string) + 1;
					 int removeBefore = sequencia.indexOf(string) - 1;
					 
					 sequencia.set(sequencia.indexOf(string), String.valueOf(resp));
					 
					 sequencia.remove(removeNext);
					 sequencia.remove(removeBefore);
					 
					 for (Iterator iterator = sequencia.iterator(); iterator.hasNext();) {
						String string2 = (String) iterator.next();
						System.out.println("--> Sequence : "+string2);
					}
					 
					 break;
					 
				 }
			}
			
			if(sequencia.size() == 1)
			{
				System.out.println("zerou");
				sair = false;
				break;
			}
			k ++;
			
			System.out.println("loop");
		}
		
		System.out.println(sequencia.get(0));
		
		return Float.valueOf(sequencia.get(0));

	}// getResult
	
	private float resp(float num1, float num2, char op)
	{
		float resp = 0;
		switch (op) {
			case '*':
				resp = num1 * num2;
				break;
			
			case '/':
				resp = num1 / num2;
				break;
				
			case '+':
				resp = num1 + num2;
				break;
				
			case '-':
				resp = num1 - num2;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
		}
		
		return resp;
	}
}
