package com.order;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GarageplugApplicationTests {

	@Test
	void contextLoads() {
		GarageplugApplication.main(new String[] {});
		assertNotNull(GarageplugApplication.class);
	}

}
