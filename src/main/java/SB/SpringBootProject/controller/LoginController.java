package SB.SpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SB.SpringBootProject.model.Book;
import SB.SpringBootProject.model.ClientRegistration;
import SB.SpringBootProject.repository.BookRepository;
import SB.SpringBootProject.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private BookRepository bookRepo;
	
	//Insert client Data 
	@PostMapping("/registration")
	public ResponseEntity<Object> registerClient(@RequestBody ClientRegistration clientRegistration ) {
		System.out.println("Controller :"+ clientRegistration.toString());
		return loginService.insertClientDetails(clientRegistration);
	}
	
	//Retrieve By ID
	@RequestMapping("/retrieveUserDetailsById/{id}")
	public ResponseEntity<Object> retrieveById(@PathVariable String id){
		return loginService.retrieveById(id);
	}
	
	//retrieve All Users details
	@RequestMapping("/retrieveUsersDetails")
	public ResponseEntity<Object> retrieveById(){
		return loginService.retrieveUsersDetails();
	}
	
	//Login API
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody ClientRegistration clientDetails){
		return loginService.login(clientDetails);
	}
	//dummy
	/*
	 * @PostMapping("/addBook") public String saveBook(@RequestBody Book book) {
	 * bookRepo.save(book); return "Added book with id : " + book.getId(); }
	 */
}
