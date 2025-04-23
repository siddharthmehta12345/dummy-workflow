package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

// DemoApplication is the main entry point of the Spring Boot application.

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
