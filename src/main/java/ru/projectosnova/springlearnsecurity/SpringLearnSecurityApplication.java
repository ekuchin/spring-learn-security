package ru.projectosnova.springlearnsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringLearnSecurityApplication implements CommandLineRunner {

	//@Autowired
	//private UserRepository repoUser;
	@Autowired
	private CatRepository repoCat;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, Security");

	//	repoUser.save(new User("user", passwordEncoder.encode("password")));
	///	repoUser.save(new User("vasya", passwordEncoder.encode("V@sy@123")));

		repoCat.save(new Cat("Мурзик", "Манул"));
		repoCat.save(new Cat("Рамзес", "Сфинкс"));
		repoCat.save(new Cat("Эдуард", "Британец"));

		System.out.println("Люди:");
		//repoUser.findAll().forEach(System.out::println);
		System.out.println("Коты:");
		repoCat.findAll().forEach(System.out::println);

	//	User first = repoUser.findById(1L).orElseThrow(()->new Exception("Нет такого пользователя."));
//		User second = repoUser.findById(2L).orElseThrow(()->new Exception("Нет такого пользователя."));

//		System.out.println(passwordEncoder.matches("password", first.getPassword()));
//		System.out.println(passwordEncoder.matches("password", second.getPassword()));

		String s=passwordEncoder.encode("password");
		System.out.println(s);
		System.out.println(passwordEncoder.matches("password",s));

	}
}
