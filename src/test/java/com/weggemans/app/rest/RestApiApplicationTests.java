package com.weggemans.app.rest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@SpringBootTest
class RestApiApplicationTests {

	@Test
	@Profile("localTest")
	void contextLoads() {
	}

}
