package red.head.deer.first

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstApp

fun main(args: Array<String>) {
    runApplication<FirstApp>(*args)
}
