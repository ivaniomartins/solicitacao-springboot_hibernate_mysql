package com.devsystem.solicitacao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsystem.solicitacao.domains.Solicitante;
import com.devsystem.solicitacao.repository.SolicitanteRepository;

@Service
public class SolicitanteService {
	
	@Autowired
	private SolicitanteRepository sp;

	
	
	public Solicitante buscar(Integer id) {
		
		Optional<Solicitante> obj = sp.findById(id);
		
			return obj.orElse(null);
		}
		
	public Solicitante insert(Solicitante obj){
	     obj.setSolicitanteId(null);
	    return sp.save(obj); 
			
	}

	

	public List<Solicitante> todosSolicitantes(){
		return sp.findAll();
	}
	
}
