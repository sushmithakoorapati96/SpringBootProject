package SB.SpringBootProject.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import SB.SpringBootProject.model.ClientRegistration;
import SB.SpringBootProject.repository.ClientRegistrationRepository;

@Service
public class LoginService {

	private ClientRegistrationRepository clientRegistrationRepository;

	public ResponseEntity<Object> insertClientDetails(ClientRegistration clientRegistration) {
		try {
			ClientRegistration clientRegistartion1 = clientRegistrationRepository.save(clientRegistration);
			return new ResponseEntity<Object>(clientRegistartion1, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
