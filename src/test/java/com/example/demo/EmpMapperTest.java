package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpMapperTest {

	@Autowired EmpMapper mapper;
	
	@Test
	public void listTest() {
		System.out.println(mapper.getEmpList(null));
	}
}
