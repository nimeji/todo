package com.nimeji.todo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class TodoApplication

fun main(args: Array<String>) {
    runApplication<TodoApplication>(*args)
}

@RestController
class HelloWorld {
    @GetMapping
    fun helloWorld(): String = "Hello, World!"
}