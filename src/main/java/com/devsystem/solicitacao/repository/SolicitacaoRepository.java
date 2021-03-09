package com.devsystem.solicitacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsystem.solicitacao.domains.Solicitacao;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Integer> {

}
