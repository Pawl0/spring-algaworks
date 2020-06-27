package com.algaworks.osworks.api.exceptionhandler;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Problema {

	public static class Campo {

		private String mensagem;
		private String nome;

		public Campo(String nome, String mensagem) {
			super();
			this.nome = nome;
			this.mensagem = mensagem;
		}

		public String getMensagem() {
			return mensagem;
		}

		public String getNome() {
			return nome;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	}
	private List<Campo> campos;
	private OffsetDateTime dataHora;
	private Integer status;

	private String titulo;

	public List<Campo> getCampos() {
		return campos;
	}

	public OffsetDateTime getDataHora() {
		return dataHora;
	}

	public Integer getStatus() {
		return status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}

	public void setDataHora(OffsetDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
