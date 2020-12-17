package SB.SpringBootProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ClientRegistration")
public class ClientRegistration {

	@Id
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private String phoneNumber;
	private String email;
	private String userName;
	private String password;

	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param dob
	 * @param phoneNumber
	 * @param email
	 * @param userName
	 * @param password
	 */
	public ClientRegistration(String firstName, String middleName, String lastName, String dob, String phoneNumber,
			String email, String userName, String password) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "ClientRegistration [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", email=" + email + ", userName=" + userName
				+ ", password=" + password + "]";
	}

	// no arg constructor
	public ClientRegistration() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
