package red.head.deer.first.service

import io.github.oshai.kotlinlogging.KotlinLogging

class SimpleService {
    companion object KLogger {
        val log = KotlinLogging.logger("FirstApp")

        fun startService() {
            log.info { "Start application" }

        }
    }
}