package ua.com.userservice.entity;

public class User {
	private String email;
	private String pass;
	private String phoneNumber;
	public User(String email, String pass, String phoneNumber) {
		super();
		this.email = email;
		this.pass = pass;
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", pass=" + pass + ", phoneNumber=" + phoneNumber + "]";
	}
}



// -------------------------------------------------------------------

package ua.com.userservice.exception;

public class UserValidationException extends Exception {
	public UserValidationException() {
		
	}
	
	public UserValidationException(String message) {
		super(message);
	}
}


// -------------------------------------------------------------------

package ua.com.userservice.exception;

public class UserValidationMessages {
	public static final String BAD_EMAIL = "bad email";
	public static final String BAD_PASS = "Password has to be longer than 6 symbols";
	public static final String BAD_PHONE_NUMBER = "It seems that you entered wrong phone number";
	
}


// -------------------------------------------------------------------


package ua.com.userservice.validator;

public interface Validator {
	public void validate(Object o) throws Exception;
}


// -------------------------------------------------------------------



package ua.com.userservice.validator.impl;

import java.util.regex.Pattern;

import ua.com.userservice.entity.User;
import ua.com.userservice.exception.UserValidationException;
import ua.com.userservice.exception.UserValidationMessages;
import ua.com.userservice.validator.Validator;

public class UserValidator implements Validator {

	private static final String PHONE_NUMBER_PATTERN = 
			"(\\+38|38)?0\\d{9}";
	
	@Override
	public void validate(Object o) throws Exception {
		if (!(o instanceof User)) {
			throw new IllegalArgumentException("UserValidator can validate only User");
		}
		User user = (User) o;
		
		if (!user.getEmail().contains("@")) {
			throw new UserValidationException(UserValidationMessages.BAD_EMAIL);
		}
		
		if (user.getPass().length() < 7) {
			throw new UserValidationException(UserValidationMessages.BAD_PASS);
		}
		
//		Pattern pattern = Pattern.compile();
		
		if (!Pattern.matches(PHONE_NUMBER_PATTERN, user.getPhoneNumber())) {
			throw new UserValidationException(UserValidationMessages.BAD_PHONE_NUMBER);
		}
		
	}

}



// -------------------------------------------------------------------

package ua.com.userservice;

import java.util.Scanner;

import ua.com.userservice.entity.User;
import ua.com.userservice.validator.Validator;
import ua.com.userservice.validator.impl.UserValidator;

public class Program {
	private static Validator validator = new UserValidator();
	
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Password: ");
			String pass = sc.next();
			System.out.print("Phone number: ");
			String number = sc.next();
			
			User user = new User(email, pass, number);
			validator.validate(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) sc.close();
		}
	}
}



