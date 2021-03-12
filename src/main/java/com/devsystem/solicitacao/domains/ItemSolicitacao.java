package com.devsystem.solicitacao.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_solicitacao")
public class ItemSolicitacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;

	@ManyToOne
	@JoinColumn(name = "solicitacao_id")
	private Solicitacao solicitacoes;


	public ItemSolicitacao(Integer itemId, Solicitacao solicitacoes) {

		this.itemId = itemId;
		this.solicitacoes = solicitacoes;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Solicitacao getSolicitacoes() {
		return solicitacoes;
	}

	public void setSolicitacoes(Solicitacao solicitacoes) {
		this.solicitacoes = solicitacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
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
		ItemSolicitacao other = (ItemSolicitacao) obj;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		return true;
	}

}
