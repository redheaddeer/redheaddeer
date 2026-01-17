package red.head.deer.runes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RunesApp

fun main(args: Array<String>) {
    runApplication<RunesApp>(*args)
}
