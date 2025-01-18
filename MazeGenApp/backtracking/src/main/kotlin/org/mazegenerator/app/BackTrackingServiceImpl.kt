package org.mazegenerator.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@Service
class BacktrackingGenerator : BackTrackingService{
    private val stack: Stack<Pair<Int, Int>> = Stack()

    override fun nextMove(vicini: List<Pair<Int, Int>>): Pair<Int, Int>? {
        return if (vicini.isNotEmpty()) {
            val next = vicini.random()
            stack.push(next)
            next
        } else if (stack.isNotEmpty()) {
            stack.pop()
        } else {
            null
        }
    }
}