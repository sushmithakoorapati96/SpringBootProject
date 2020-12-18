package SB.SpringBootProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "ClientRegistration")
public class ClientRegistration {

	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private String phoneNumber;
	private String email;
	private String userName;
	private String password;
}
