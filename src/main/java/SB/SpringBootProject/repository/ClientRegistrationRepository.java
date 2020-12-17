package SB.SpringBootProject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import SB.SpringBootProject.model.ClientRegistration;

public interface ClientRegistrationRepository extends MongoRepository<ClientRegistration, String>  {

	
}
