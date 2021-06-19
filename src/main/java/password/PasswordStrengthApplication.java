package password;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import password.util.Password;

@SpringBootApplication
public class PasswordStrengthApplication {

	private static Password password = new Password();

	public static void main(String[] args) {

		SpringApplication.run(PasswordStrengthApplication.class, args);
		System.out.println(password.check("psw!as!a"));

	}

}
