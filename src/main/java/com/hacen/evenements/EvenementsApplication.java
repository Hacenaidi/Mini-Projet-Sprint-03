package com.hacen.evenements;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.hacen.evenements.model.Evenement;
import com.hacen.evenements.service.EvenementService;


@SpringBootApplication
public class EvenementsApplication  implements CommandLineRunner{
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	@Autowired
    EvenementService evenementservice;

	public static void main(String[] args) {
		SpringApplication.run(EvenementsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Evenement.class);
		
	}

}
