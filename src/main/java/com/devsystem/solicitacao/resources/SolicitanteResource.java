package com.devsystem.solicitacao.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsystem.solicitacao.domains.Solicitante;

@RestController
@RequestMapping(value="/solicitantes")
public class SolicitanteResource {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Solicitante> listar() {
		
		Solicitante s1 = new Solicitante(null,"Ivanio");
		Solicitante s2 = new Solicitante(null, "João");
        
		List<Solicitante> lista = new ArrayList<>();
		lista.add(s1);
		lista.add(s2);
		
		return lista;

	}
	
	

}
