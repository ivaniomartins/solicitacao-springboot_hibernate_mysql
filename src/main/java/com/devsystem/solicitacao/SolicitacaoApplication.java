package com.devsystem.solicitacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsystem.solicitacao.domains.Solicitante;
import com.devsystem.solicitacao.repository.SolicianteRepository;

@SpringBootApplication
public class SolicitacaoApplication implements CommandLineRunner {

	@Autowired
	public SolicianteRepository sr;
	
	public static void main(String[] args) {
		SpringApplication.run(SolicitacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Solicitante s1 = new Solicitante(null, "Ivanio Martins");
		Solicitante s2 = new Solicitante(null, "Janinny Pessoa");
		
		sr.saveAll(Arrays.asList(s1, s2));
	}

}
