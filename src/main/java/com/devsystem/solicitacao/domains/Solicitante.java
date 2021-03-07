package com.devsystem.solicitacao.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Solicitante implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer solicitante_id;
	private String nm_solicitante;

	public Solicitante(Integer solicitante_id, String nm_solicitante) {

		this.solicitante_id = solicitante_id;
		this.nm_solicitante = nm_solicitante;
	}

	public Integer getSolicitante_id() {
		return solicitante_id;
	}

	public void setSolicitante_id(Integer solicitante_id) {
		this.solicitante_id = solicitante_id;
	}

	public String getNm_solicitante() {
		return nm_solicitante;
	}

	public void setNm_solicitante(String nm_solicitante) {
		this.nm_solicitante = nm_solicitante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((solicitante_id == null) ? 0 : solicitante_id.hashCode());
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
		if (solicitante_id == null) {
			if (other.solicitante_id != null)
				return false;
		} else if (!solicitante_id.equals(other.solicitante_id))
			return false;
		return true;
	}

}
