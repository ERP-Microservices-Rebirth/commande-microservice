package tn.esprit.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.microservice.entity.Commande;
import tn.esprit.microservice.entity.Produit;
import tn.esprit.microservice.service.ICommandeService;

@RestController
@RequestMapping(value = "/api/commandes")
public class CommandeRestController {

	@Autowired
	ICommandeService commandeService;
	
	
	
	
	// list commande : http://localhost:8082/api/commandes
		@GetMapping
		@ResponseStatus(HttpStatus.CREATED)
		public List<Commande> retrieveAllCommande() {
			return commandeService.retrieveAllCommande();
		}

}
