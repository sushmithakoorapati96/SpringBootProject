package SB.SpringBootProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import SB.SpringBootProject.model.ClientRegistration;
import SB.SpringBootProject.repository.ClientRegistrationRepository;

@Service
public class LoginService {

	@Autowired
	private ClientRegistrationRepository clientRegistrationRepository;

	public ResponseEntity<Object> insertClientDetails(ClientRegistration clientRegistration) {

		try {
			System.out.println("Service :" + clientRegistration.toString());
			ClientRegistration clientRegistartion1 = clientRegistrationRepository.save(clientRegistration);
			return new ResponseEntity<Object>(clientRegistartion1, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
