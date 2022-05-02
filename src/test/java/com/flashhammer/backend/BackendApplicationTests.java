package com.flashhammer.backend;

import com.flashhammer.backend.controller.RestEndpoint;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	private RestEndpoint controller;

	@Test
	void contextLoads() {
		assertThat(this.controller).isNotNull();
	}

	@Test
	void hello() {
		assertThat(this.controller.hello()).isEqualTo("Hello human!");
	}

}
