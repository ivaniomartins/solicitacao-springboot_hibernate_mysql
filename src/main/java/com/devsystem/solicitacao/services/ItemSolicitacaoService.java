package com.devsystem.solicitacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsystem.solicitacao.domains.ItemSolicitacao;
import com.devsystem.solicitacao.resources.ItemSolicitacaoRepository;

@Service
public class ItemSolicitacaoService {

	@Autowired
	public ItemSolicitacaoRepository it;


   public ItemSolicitacao buscarItem(Integer id) {
	   
	   Optional<ItemSolicitacao> obj = it.findById(id);
	   
	   return obj.orElse(null);
   }

}
