package SB.SpringBootProject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import SB.SpringBootProject.model.Book;

public interface BookRepository extends MongoRepository <Book, Integer>{

}
