package com.devsystem.solicitacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsystem.solicitacao.domains.ItemSolicitacao;

@Repository
public interface ItemSolicitacaoRepository extends JpaRepository<ItemSolicitacao, Integer> {

}
