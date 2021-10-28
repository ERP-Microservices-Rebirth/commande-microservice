package tn.esprit.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.microservice.entity.Commande;


@Repository
public interface CommandeRepository extends MongoRepository<Commande,String> {

}
