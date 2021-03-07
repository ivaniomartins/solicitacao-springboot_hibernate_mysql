package com.devsystem.solicitacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsystem.solicitacao.domains.Solicitante;

public interface SolicianteRepository extends JpaRepository<Solicitante, Integer> {

}
