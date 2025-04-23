package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

@SpringBootTest
class DemoApplicationTests {

	@Test
	fun mockEqualTest() {
		val a = "Hello"
		val b = "Hello"
		assertEquals(a,b)
	}

	@Test
	fun mockUnEqualTest() {
		val a = "Hello"
		val b = "World"
		assertNotEquals(a,b)
	}

}
