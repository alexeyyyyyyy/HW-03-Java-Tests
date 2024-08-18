package home.work.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import home.work.model.User_Password;

class PasswordTest {
	User_Password user;
	String password = "1234Peter!";
	
	
	@BeforeEach
	void setUp() throws Exception {
		user = new User_Password(password);
	}

	@Test
	void testPasswordLenght () {
		String inValidPassword = "1234Q2e";
		user.setPassword(inValidPassword);
		assertEquals(password,user.getPassword());
	}
	@Test
	void testPasswordDigits() {
		String inValidPassword = "Qwertyhs";
		user.setPassword(inValidPassword);
		assertEquals(password,user.getPassword());
	}
	@Test 
	void testPasswordUpperCase() {
		String inValidPassword = "qwerty5&";
		user.setPassword(inValidPassword);
		assertEquals(password,user.getPassword());
	}
	@Test
	void testPasswordLowerCase() {
		String inValidPassword = "QWERT1H!";
		user.setPassword(inValidPassword);
		assertEquals(password,user.getPassword());
	}
	@Test 
	void testPasswordSpecialSymbols() {
		String inValidPassword = "Qwerty123h";
		user.setPassword(inValidPassword);
		assertEquals(password,user.getPassword());
		
	}
	@Test
	void testValidPassword() {
		String validPassword = "1234Peter!";
		user.setPassword(validPassword);
		assertEquals(password,user.getPassword());
	}
	
}
