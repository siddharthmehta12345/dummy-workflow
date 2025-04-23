package com.example.demo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ReadinessCheckController {

    //This is a controller

    @GetMapping("/ping")
    fun ping(): ResponseEntity<Any> {
        return ResponseEntity("PONG", HttpStatus.OK)
    }
}
