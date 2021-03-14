package com.devsystem.solicitacao;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsystem.solicitacao.domains.ItemSolicitacao;
import com.devsystem.solicitacao.domains.Servico;
import com.devsystem.solicitacao.domains.Solicitacao;
import com.devsystem.solicitacao.domains.Solicitante;
import com.devsystem.solicitacao.repository.ItemSolicitacaoRepository;
import com.devsystem.solicitacao.repository.ServicoRepository;
import com.devsystem.solicitacao.repository.SolicitacaoRepository;
import com.devsystem.solicitacao.repository.SolicitanteRepository;

@SpringBootApplication
public class SolicitacaoApplication implements CommandLineRunner {

	@Autowired
	public SolicitanteRepository sr;

	@Autowired
	public SolicitacaoRepository sol;
	
	@Autowired
	public ServicoRepository ser;
	
	@Autowired
	public ItemSolicitacaoRepository is;

	public static void main(String[] args) {
		SpringApplication.run(SolicitacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	

		Solicitante s1 = new Solicitante(null, "Ivanio Martins", "ivaniomartins1991@gmail.com");
		Solicitante s2 = new Solicitante(null, "Janinny Pessoa", "janinnypessoa@gmail.com");
		
		sr.saveAll(Arrays.asList(s1, s2));
		 
		Solicitacao t1 = new Solicitacao(null, LocalDate.now(), s1);
		Solicitacao t2 = new Solicitacao(null, LocalDate.now(), s2);

		s1.getSolicitacoes().add(t1);
		s2.getSolicitacoes().add(t2);

		
		sol.saveAll(Arrays.asList(t1,t2));
				
		Servico srv1 = new Servico(null, "Manutenção Predial");
		Servico srv2 = new Servico(null, "Manutenção Preventiva");
		
		ser.saveAll(Arrays.asList(srv1, srv2));
		
	    ItemSolicitacao it = new ItemSolicitacao(null, t1,srv1);
	    ItemSolicitacao it2 = new ItemSolicitacao(null, t1,srv2);
	    ItemSolicitacao it3 = new ItemSolicitacao(null, t2,srv1);
	    ItemSolicitacao it4 = new ItemSolicitacao(null, t2,srv2);
	    
	    t1.getItemSolicitacoes().add(it);
	    t1.getItemSolicitacoes().add(it2);
	    t2.getItemSolicitacoes().add(it3);
	    t2.getItemSolicitacoes().add(it4);
	   
	   is.saveAll(Arrays.asList(it, it2,it3, it4));

	}

}
