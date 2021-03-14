package com.devsystem.solicitacao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.solicitacao.domains.Servico;
import com.devsystem.solicitacao.services.ServicoService;

@RestController
@RequestMapping(value="/servicos")
public class ServicoResource {
	@Autowired
	private ServicoService service;
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ) {
		
		Servico obj = service.buscarServico(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	

}
