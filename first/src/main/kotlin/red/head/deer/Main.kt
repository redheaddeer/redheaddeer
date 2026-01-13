package red.head.deer

import io.github.oshai.kotlinlogging.KotlinLogging

class Main {
    companion object KLogger {
        val log = KotlinLogging.logger("FirstApp")
        @JvmStatic
        fun main(args: Array<String>) {
            log.info { "Start application" }

        }
    }
}