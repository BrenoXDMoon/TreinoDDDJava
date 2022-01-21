package com.example.TreinoDDD;

import com.example.TreinoDDD.entity.User;
import com.example.TreinoDDD.service.IUserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.aspectj.apache.bcel.Repository.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TreinoDddApplicationTests {

	private static User user;

	@BeforeAll
	public static void init(){
		user = new User("Felipe Dilon", "Silva", "felipeno@youtube.com");
		System.out.println("Iniciando testes");
	}

	@Autowired
	private IUserService service;

	@Test
	public void registerUser() {
		user = service.save(user);

		assertNotNull(user, "Objeto de registro nulo");
	}

	@Test
	public void updateUser(){

		user.setFirstName("Felca");
		user.setLastName("Felipeno");
		user.setEmail("felipeno@youtube.com");

		assertNotNull(service.edit(user), "Objeto de edição nulo");
	}

	@Test
	public void deleteUserByAnId(){
		assertNotNull(service.delete(service.findById(user.getId())), "Objeto de exclusão nulo");
	}
}
