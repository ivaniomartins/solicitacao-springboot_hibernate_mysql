package com.devsystem.solicitacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsystem.solicitacao.domains.Solicitacao;
import com.devsystem.solicitacao.repository.SolicitacaoRepository;
import com.devsystem.solicitacao.services.exception.DataNotFoundException;

@Service
public class SolicitacaoService {
	
@Autowired	
 public SolicitacaoRepository solrep;


public Solicitacao buscarsol(Integer id) {
	Optional<Solicitacao> op = solrep.findById(id);
	
	return op.orElseThrow(()-> new DataNotFoundException("Solicitacao não encontrada: " + id + " Tipo: " +
	Solicitacao.class.getName()));
}


}
