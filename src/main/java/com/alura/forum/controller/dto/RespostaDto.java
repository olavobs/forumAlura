package com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import com.alura.forum.model.Resposta;

public class RespostaDto {

	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;

	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.nomeAutor = resposta.getAutor().getNome();
		this.dataCriacao = resposta.getDataCriacao();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

}
