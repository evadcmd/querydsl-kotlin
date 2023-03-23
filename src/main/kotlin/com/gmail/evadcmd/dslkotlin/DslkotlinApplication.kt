package com.gmail.evadcmd.dslkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DslkotlinApplication

fun main(args: Array<String>) {
	runApplication<DslkotlinApplication>(*args)
}
