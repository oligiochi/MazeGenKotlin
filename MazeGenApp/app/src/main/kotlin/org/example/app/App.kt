package org.example.app

import org.apache.commons.text.WordUtils
import org.example.utilities.StringUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Application : CommandLineRunner {
    override fun run(vararg args: String?) {
        // Esegui la logica principale all'avvio dell'applicazione
        val tokens = StringUtils.split(MessageUtils.getMessage())
        val result = StringUtils.join(tokens)
        println(WordUtils.capitalize(result)) // Stampa il risultato nella console
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@RestController
class MessageController {

    @GetMapping("/message")
    fun getMessage(): String {
        // Simula la logica di manipolazione del messaggio tramite una REST API
        val tokens = StringUtils.split(MessageUtils.getMessage())
        val result = StringUtils.join(tokens)
        return WordUtils.capitalize(result)
    }
}
