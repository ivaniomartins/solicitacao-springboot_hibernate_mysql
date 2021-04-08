package com.devsystem.solicitacao.domains;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "solicitacao")

public class Solicitacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer solicitacaoId;

	private LocalDate dtSolicitacao = LocalDate.now();
    @JsonIgnore
	@ManyToOne
	@JoinColumn(name = "solicitanteId")
	private Solicitante usuario;
    
	
	@JsonIgnore
	@OneToMany(mappedBy="solicitacoes")
	private List<ItemSolicitacao> itemsolicitacoes = new ArrayList<>();

	public Solicitacao() {

	}

	public Solicitacao(Integer solicitacaoId, LocalDate dtSolicitacao, Solicitante usuario) {

		this.solicitacaoId = solicitacaoId;
		this.dtSolicitacao = dtSolicitacao;
		this.usuario = usuario;
	}
      

	
	public Integer getSolicitacaoId() {
		return solicitacaoId;
	}

	public void setSolicitacaoId(Integer solicitacaoId) {
		this.solicitacaoId = solicitacaoId;
	}

	public LocalDate getDtSolicitacao() {
		return dtSolicitacao;
	}

	public void setDtSolicitacao(LocalDate dtSolicitacao) {
		this.dtSolicitacao = dtSolicitacao;
	}

	public List<ItemSolicitacao> getItemSolicitacoes() {
		return itemsolicitacoes;
	}

	public void setItemSolicitacoes(List<ItemSolicitacao> itemsolicitacoes) {
		this.itemsolicitacoes = itemsolicitacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((solicitacaoId == null) ? 0 : solicitacaoId.hashCode());
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
		if (solicitacaoId == null) {
			if (other.solicitacaoId != null)
				return false;
		} else if (!solicitacaoId.equals(other.solicitacaoId))
			return false;
		return true;
	}

}
