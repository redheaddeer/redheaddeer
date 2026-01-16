package red.head.deer.tarot.service

import io.github.oshai.kotlinlogging.KotlinLogging
import red.head.deer.tarot.cards.Deck
import kotlin.random.Random

class SimpleService {
    companion object KLogger {
        val log = KotlinLogging.logger("FirstApp")

        fun startService() {
            log.info { "Start application" }
        }

        fun dayProphecy(): String {
            val card = Random.nextInt(0, Deck().majorArcane.size)
            return Deck().majorArcane[card]
        }
    }
}