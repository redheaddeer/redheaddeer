package red.head.deer.oracle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OracleApp

fun main(args: Array<String>) {
    runApplication<OracleApp>(*args)
}
