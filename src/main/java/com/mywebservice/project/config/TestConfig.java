package com.mywebservice.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mywebservice.project.entities.User;
import com.mywebservice.project.repositories.UserRepository;

//anotação criada para informar ao spring que esta é uma classe de configuração
//anotação profile referente ao application.properties "spring.profiles.active"

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	//Criado a anotação para associar esta classe ao pacote repositories
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//usuários para test inicial
		User u1 = new User(null, "Logan", "logan@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Scott Summers", "scott@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
