package SB.SpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SB.SpringBootProject.model.ClientRegistration;
import SB.SpringBootProject.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/registration")
	public ResponseEntity<Object> registerClient(@RequestBody ClientRegistration clientRegistration ) {
		return loginService.insertClientDetails(clientRegistration);
	}
}
