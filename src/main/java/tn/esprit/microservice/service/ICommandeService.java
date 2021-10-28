package tn.esprit.microservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.microservice.entity.Commande;



@Service
public interface ICommandeService {
	List<Commande> retrieveAllCommande();
	Commande addCommande(Commande commande);
	void deleteCommande(String id);
	Commande updateCommande(String id, Commande commande);
	Commande retrieveCommande(String id);
}
