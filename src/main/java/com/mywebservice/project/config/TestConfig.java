package com.mywebservice.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mywebservice.project.entities.Order;
import com.mywebservice.project.entities.User;
import com.mywebservice.project.repositories.OrderRepository;
import com.mywebservice.project.repositories.UserRepository;

//anotação criada para informar ao spring que esta é uma classe de configuração
//anotação profile referente ao application.properties "spring.profiles.active"

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	//Criado a anotação para associar esta classe ao pacote repositories
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//usuários para test inicial
		User u1 = new User(null, "Logan", "logan@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Scott Summers", "scott@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2021-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2021-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2021-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}

}