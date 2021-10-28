package tn.esprit.microservice.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.microservice.entity.Commande;
import tn.esprit.microservice.repository.CommandeRepository;

@Service
public class CommandeServiceImpl implements ICommandeService {
	
	@Autowired
	CommandeRepository commandeRepository;
	
	private static final Logger l = LogManager.getLogger(CommandeServiceImpl.class);
	
	@Override
	public List<Commande> retrieveAllCommande() {
		// TODO Auto-generated method stub
		List<Commande> commandes = commandeRepository.findAll();
		for (Commande commande : commandes) {
			l.info("user +++" + commande);
		}
		return commandes;
	}

	@Override
	public Commande addCommande(Commande commande) {
		// TODO Auto-generated method stub
		return commandeRepository.save(commande);
	}

	@Override
	public void deleteCommande(String id) {
		// TODO Auto-generated method stub
		commandeRepository.deleteById(id);
	}

	@Override
	public Commande updateCommande(String id, Commande commande) {
		// TODO Auto-generated method stub
		if (commandeRepository.findById(id).isPresent()) {
			Commande commandeExistant = commandeRepository.findById(id).get();
			commandeExistant.setDate(commande.getDate());
			commandeExistant.setEtat(commande.getEtat());
			commandeExistant.setProduit(commande.getProduit());
			return commandeRepository.save(commandeExistant);
		} else return null;
	}

	@Override
	public Commande retrieveCommande(String id) {
		// TODO Auto-generated method stub
		return commandeRepository.findById(id).get();
	}

}
