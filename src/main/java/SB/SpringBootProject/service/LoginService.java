package SB.SpringBootProject.service;

import java.util.List;
import java.util.Optional;

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
	
	public ResponseEntity<Object> retrieveById(String id){
		try {
			Optional<ClientRegistration> cr =  clientRegistrationRepository.findById(id);
			return new ResponseEntity<Object>(cr, HttpStatus.FOUND);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<Object> retrieveUsersDetails(){
		try {
			List<ClientRegistration> allUsers = clientRegistrationRepository.findAll();
			return new ResponseEntity<Object>(allUsers, HttpStatus.FOUND);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(null, HttpStatus.FOUND);
		}
	}
	
	public ResponseEntity<Object> login(ClientRegistration client){
		try {
			if(client.getEmail() != null) {
				Optional<ClientRegistration> cr =  clientRegistrationRepository.findById(client.getEmail());
				String pswd = client.getPassword();
			
				System.out.println("password "+ pswd);
				System.out.println("Cr output "+cr.get());
				return new ResponseEntity<Object>(cr, HttpStatus.FOUND);
			}else{
				System.out.println("Email id is empty, please enter a valid email address");
				return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
