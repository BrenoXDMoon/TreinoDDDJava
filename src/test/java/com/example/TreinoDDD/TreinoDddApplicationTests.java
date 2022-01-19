package com.example.TreinoDDD;

import com.example.TreinoDDD.facade.IUserFacade;
import com.example.TreinoDDD.facade.dto.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
class TreinoDddApplicationTests {

	@BeforeAll
	public static void init(){

		System.out.println("Iniciando testes");
	}

	@Autowired
	private IUserFacade userFacade;

	@Test
	public void registerUser() {

		try{
			userFacade.save(new UserDTO("Felca", "Felipeno", "felipeno@youtube.com"));
			System.out.println("Sucesso ao salvar!!!!");
		}catch(Exception e){
			Assertions.fail("Falha ao Salvar");
		}
	}

	@Test
	public void updateUser(){
		try{
			userFacade.edit(12L, new UserDTO("Felca", "Felipeno", "felipeno@youtube.com"));
			System.out.println("Sucesso ao editar!!!!");
		}catch(Exception e){
			Assertions.fail("Falha ao Editar");
		}
	}

	@Test
	public void deleteUser(){

		try{
			userFacade.delete(12L);
			System.out.println("Sucesso ao deletar!!!!");
		}catch(Exception e){
			Assertions.fail("Falha ao Deletar");
		}
	}

	@Test
	public void getAllUsers(Pageable pageable){
		try{
			System.out.println(userFacade.getAllUsers(pageable));
			System.out.println("Sucesso ao consultar!!!!");
		}catch(Exception e){
			Assertions.fail("Falha ao consultar");
		}
	}

	@Test
	public void getUserByID(){

		try{
			System.out.println(userFacade.findUserById(8L));
			System.out.println("Sucesso ao consultar por ID!!!!");
		}catch(Exception e){
			Assertions.fail("Falha ao consultar por ID");
		}

	}

}
