package com.devsystem.solicitacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsystem.solicitacao.domains.Solicitante;

public interface SolicitanteRepository extends JpaRepository<Solicitante, Integer> {

}
