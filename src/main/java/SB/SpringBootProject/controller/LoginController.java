package SB.SpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/registration")
	public ResponseEntity<Object> registerClient(@RequestBody ClientRegistration clientRegistration ) {
		System.out.println("Controller :"+ clientRegistration.toString());
		return loginService.insertClientDetails(clientRegistration);
	}
	
	//dummy
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		bookRepo.save(book);
		return "Added book with id : " + book.getId();
	}
}
