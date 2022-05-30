package com.icarros.validateForm;

public class ValidateForm {
	
	private String id;
	private String nome;
	private String email;
	private String idade;
	
	public ValidateForm(String id, String nome, String email, String idade)
	{
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	public boolean isValidForm()
	{
		boolean y = false;
		
		try {			
			Integer.parseInt(id);
			Integer.parseInt(idade);
			
			y = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getCause();
		}
		
		if(this.nome.isBlank())
		{
			System.out.println("--> campo nome esta nullo ");
		}
		
		
		return y;
	}

}
