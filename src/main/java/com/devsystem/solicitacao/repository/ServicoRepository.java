package com.devsystem.solicitacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsystem.solicitacao.domains.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer>{
	


}
