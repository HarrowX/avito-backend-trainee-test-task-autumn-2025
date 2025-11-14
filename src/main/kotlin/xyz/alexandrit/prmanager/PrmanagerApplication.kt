package xyz.alexandrit.prmanager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrmanagerApplication

fun main(args: Array<String>) {
    runApplication<PrmanagerApplication>(*args)
}
