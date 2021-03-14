package com.devsystem.solicitacao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.solicitacao.domains.Solicitante;
import com.devsystem.solicitacao.services.SolicitanteService;

@RestController
@RequestMapping(value="/solicitantes")
public class SolicitanteResource {
	@Autowired
	private SolicitanteService service;
	
	
@RequestMapping(method=RequestMethod.GET)	
public ResponseEntity<List<Solicitante>> findAll(){
		
		List <Solicitante> list = service.toDosSolicitantes();
		
		return ResponseEntity.ok().body(list); 
		
		
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ) {
		
		Solicitante obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	

}
