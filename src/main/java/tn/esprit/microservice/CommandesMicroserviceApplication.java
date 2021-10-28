package tn.esprit.microservice;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import tn.esprit.microservice.entity.Commande;
import tn.esprit.microservice.entity.Produit;
import tn.esprit.microservice.repository.CommandeRepository;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CommandesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandesMicroserviceApplication.class, args);
	}/*
	// @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test/rest")
    public Produit testRestTemplate(){
       Produit response = this.restTemplate.getForObject("http://localhost:8081/api/produit/getProduit/617a681911ea3611f0c4e470", Produit.class);
       
       System.out.println("produit"+response);
        return response;
    }
	@Bean
	ApplicationRunner init(CommandeRepository produitRepository) {
		Produit produit = testRestTemplate();
	    Commande commande = new Commande("08/05/2021","test",produit);
		return args -> {
			Stream.of(commande).forEach(comm -> {
				produitRepository.save(comm);
			});
		};
}
*/
}
