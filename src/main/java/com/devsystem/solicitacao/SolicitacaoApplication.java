package com.devsystem.solicitacao;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsystem.solicitacao.domains.Servico;
import com.devsystem.solicitacao.domains.Solicitacao;
import com.devsystem.solicitacao.domains.Solicitante;
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
		
		
		Servico ser1 = new Servico(null, "Limpeza da caixa d'agua");
		
		ser.saveAll(Arrays.asList(ser1));

	}

}
