package home.work.model;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

public class User_Password {

	String password;
	
	
	public User_Password (String password) {
		this.password = password;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(isValidPassword(password)) {
			this.password = password;
		}else {
			System.out.println(password + "Password is not Valid");
		}
		
	}


	private boolean isValidPassword(String password) {
		if(password.length() < 8 ) {
			return false;
		}
		boolean hasDigit = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasSpecialChar = false;
		
		for(char c : password.toCharArray()) {
			if(Character.isDigit(c)) {
				hasDigit = true;
			} else if (Character.isUpperCase(c)) {
				hasUpperCase = true;
			} else if (Character.isLowerCase(c)) {
				hasLowerCase = true;
			}else if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				hasSpecialChar = true;
			}
		}
		
		return hasDigit && hasUpperCase && hasLowerCase && hasSpecialChar;
	}
	
	@Override
	public String toString() {
		return "User password : " + password;
	}
}
