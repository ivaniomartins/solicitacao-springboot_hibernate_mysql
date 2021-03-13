package com.devsystem.solicitacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsystem.solicitacao.domains.Servico;
import com.devsystem.solicitacao.repository.ServicoRepository;

@Service
public class ServicoService {

@Autowired
private ServicoRepository servrep;


public Servico buscarServico(Integer id) {
	
	Optional<Servico> obj = servrep.findById(id); 
	
	return obj.orElse(null);
}

	
	
}
