package com.devsystem.solicitacao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.solicitacao.domains.Solicitacao;
import com.devsystem.solicitacao.services.SolicitacaoService;

@RestController
@RequestMapping(value="/solicitacoes")
public class SolicitacaoResource {
	@Autowired
	private SolicitacaoService service;
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ) {
		
		Solicitacao obj = service.buscarsol(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	

}
