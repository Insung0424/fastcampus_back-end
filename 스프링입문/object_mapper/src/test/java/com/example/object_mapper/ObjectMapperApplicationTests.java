package com.example.object_mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("=========================");


		//object mapper 가 하는일
		// Text Json -> object : get method 를 활용한다
		// object -> Text Json : 기본 생성자를 활용한다

		var objectMapper = new ObjectMapper();
		var user = new User("tomas",30,"010-1234-5678");

		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		var objectUser = objectMapper.readValue(text,User.class);
		System.out.println(objectUser);

	}

}
