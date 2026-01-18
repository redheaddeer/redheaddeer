package red.head.deer.runes.service

import kotlin.random.Random

class RuneService {

    val runes = listOf(
        "ansuz",
        "berkano",
        "dagaz",
        "ehwas",
        "eihwas",
        "elhaz",
        "fehu",
        "gebo",
        "hagalaz",
        "ingwaz",
        "isa",
        "jera",
        "kenaz",
        "laguz",
        "mannaz",
        "naudhiz",
        "odin",
        "othala",
        "perthro",
        "raido",
        "sowilo",
        "thurisaz",
        "tiwaz",
        "uruz",
        "wunjo"
    )

    fun getRune() {
        val rune = Random.nextInt(0, runes.size)
        println(runes[rune])

    }
}