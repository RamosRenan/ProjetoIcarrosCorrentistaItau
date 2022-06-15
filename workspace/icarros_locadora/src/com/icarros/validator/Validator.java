package com.icarros.validator;

import com.icarros.components.Formulario;

/**
 * @author renan barbosa
 * 
 *         Classe responsavel por validar campos do formulário
 * 
 */
public class Validator {

	private String nome;
	private String duracao;
	private String genero_filme;
	private String data_lancamento;
	private String sinopse_filme;

	private String message = "";

	/**
	 * @param Formulario formulario
	 * 
	 * @apiNote recebe como parametro no construtor o formulario a ser valiudado
	 */
	public Validator(Formulario formulario) {

		nome = formulario.gettextFielNome().getText();
		duracao = formulario.getFieldDuration().getText();
		genero_filme = formulario.getFieldGenero().getText();
		data_lancamento = formulario.getFieldData().getText();
		sinopse_filme = formulario.getFieldSinopse().getText();
//		imagem_filme;

	}

	public boolean isValid() {
		if (this.nome.isBlank() || this.duracao.isBlank() || this.genero_filme.isBlank()
				|| this.data_lancamento.isBlank() || this.sinopse_filme.isBlank()) {
			return false;
		}
		return true;
	}

	public String getMessage() {
		message += this.nome.isBlank() ? "Campo nome inválido " : " ";

		message += this.duracao.isBlank() ? "Campo duração inválido " : " ";

		message += this.genero_filme.isBlank() ? "Campo genero invalido " : " ";

		message += this.data_lancamento.isBlank() ? "Campo data inválido " : " ";

		message += this.sinopse_filme.isBlank() ? "campo sinopse inválido " : " ";

		return message;
	}

}
