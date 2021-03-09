package com.devsystem.solicitacao.domains;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitacao")

public class Solicitacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer solicitacao_id;

	private LocalDate dt_solicitacao = LocalDate.now();

	@ManyToOne
	@JoinColumn(name = "solicitante_id")
	private Solicitante usuario;

	public Solicitacao() {

	}

	public Solicitacao(Integer solicitacao_id, LocalDate dt_solicitacao, Solicitante usuario) {
	
		this.solicitacao_id = solicitacao_id;
		this.dt_solicitacao = dt_solicitacao;
		this.usuario = usuario;
	}



	public Integer getSolicitacao_id() {
		return solicitacao_id;
	}

	public void setSolicitacao_id(Integer solicitacao_id) {
		this.solicitacao_id = solicitacao_id;
	}

	public LocalDate getDt_solicitacao() {
		return dt_solicitacao;
	}

	public void setDt_solicitacao(LocalDate dt_solicitacao) {
		this.dt_solicitacao = dt_solicitacao;
	}

	public Solicitante getSolicitante() {
		return usuario;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.usuario = solicitante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((solicitacao_id == null) ? 0 : solicitacao_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solicitacao other = (Solicitacao) obj;
		if (solicitacao_id == null) {
			if (other.solicitacao_id != null)
				return false;
		} else if (!solicitacao_id.equals(other.solicitacao_id))
			return false;
		return true;
	}

}
