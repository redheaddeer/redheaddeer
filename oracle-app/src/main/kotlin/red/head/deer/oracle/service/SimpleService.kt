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
                "Знаки судьбы шепчут вам тайны",
                "Услышь послания мира духов",
                "Что скрывают древние символы?",
                "Границы миров стерлись — узнайте, что впереди",
                "Разгадай шифры Вселенной",
                "Путь откроется лишь избранному",
                "Предсказания рождаются в тишине ночи",
                "Время покажет... Или мы покажем сами?",
                "Необычные знаки ведут тебя вперёд",
                "Послушай голос прошлого, он расскажет о будущем",
                "Древние тайны ждут расшифровки",
                "Истинный путь лежит там, куда никто не смотрит",
                "Магия в словах, сила в знании",
                "Ответы скрыты глубоко, но достать их возможно",
                "Раскрой завесу неопределённости",
                "Прислушайся к звёздам, они заговорят с тобой",
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