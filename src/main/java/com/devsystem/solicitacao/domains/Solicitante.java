package com.devsystem.solicitacao.domains;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "solicitante")
public class Solicitante implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer solicitanteId;
	private String nmSolicitante;
	private String email;

	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Solicitacao> solicitacoes = new ArrayList<>();

	public Solicitante() {

	}

	public Solicitante(Integer solicitanteId, String nmSolicitante, String email) {

		this.solicitanteId = solicitanteId;
		this.nmSolicitante = nmSolicitante;
		this.email = email;
	}

	public Integer getSolicitanteId() {
		return solicitanteId;
	}

	public void setSolicitanteId(Integer solicitanteId) {
		this.solicitanteId = solicitanteId;
	}

	public String getNmSolicitante() {
		return nmSolicitante;
	}

	public void setNmSolicitante(String nmSolicitante) {
		this.nmSolicitante = nmSolicitante;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}

	public void setSol(List<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((solicitanteId == null) ? 0 : solicitanteId.hashCode());
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
		Solicitante other = (Solicitante) obj;
		if (solicitanteId == null) {
			if (other.solicitanteId != null)
				return false;
		} else if (!solicitanteId.equals(other.solicitanteId))
			return false;
		return true;
	}




}
