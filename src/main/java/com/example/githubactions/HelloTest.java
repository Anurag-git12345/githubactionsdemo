package com.example.githubactions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloTest {

	@Test
	void testSum() {
		int result = 2 + 3;
		assertEquals(5, result);
	}
}
