package com.devsystem.solicitacao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.solicitacao.domains.ItemSolicitacao;
import com.devsystem.solicitacao.services.ItemSolicitacaoService;

@RestController
@RequestMapping(value="/itens")
public class ItemSolicitacaoResource {
	@Autowired
	private ItemSolicitacaoService service;
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ) {
		
		ItemSolicitacao obj = service.buscarItem(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	

}
