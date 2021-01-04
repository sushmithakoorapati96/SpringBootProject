package SB.SpringBootProject.response.models;

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

public class ClientRegistrationResponse {

	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private String phoneNumber;
	private String email;
	private String password;
}