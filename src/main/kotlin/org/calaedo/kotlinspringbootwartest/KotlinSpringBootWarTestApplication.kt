package org.calaedo.kotlinspringbootwartest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinSpringBootWarTestApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringBootWarTestApplication::class.java, *args)
}
