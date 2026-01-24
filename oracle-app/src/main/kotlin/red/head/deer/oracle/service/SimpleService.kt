package red.head.deer.oracle.service

import io.github.oshai.kotlinlogging.KotlinLogging
import red.head.deer.oracle.cards.Deck
import kotlin.random.Random

class SimpleService {
    companion object KLogger {
        val log = KotlinLogging.logger("FirstApp")

        var localization: String = "en"

        fun getTitle(): String {
            val titles = listOf(
                "Всё тайное становится явным...",
                "Твоя судьба в твоих руках",
                "Ничто не вечно, но всё циклично",
                "А мы всё знаем...",
            )
            return titles[Random.nextInt(0, titles.size)]
        }

        fun startService() {
            log.info { "Start application" }
        }

        fun dayProphecy(): String {
            val card = Random.nextInt(0, Deck().majorArcane.size)
            return Deck().majorArcane[card]
        }

        fun setLocale(locale: String) {
            localization = locale
        }
    }
}