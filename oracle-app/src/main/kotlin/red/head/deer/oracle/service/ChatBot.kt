package red.head.deer.oracle.service

class ChatBot {
    fun runeDesk(rune: String, question: String) {
        val msg = """
            Дай краткую трактовку руны $rune в качестве ответа на вопрос 
            ```
            $question
            ```
        """.trimIndent()

//        https://maxgpt.ru/api/chatfv
    }

    fun tarotDesk(card: String, question: String) {
        val msg = """
            Дай краткую трактовку карты таро $card в качестве ответа на вопрос 
            ```
            $question
            ```
        """.trimIndent()
    }

    fun runeDesk(runes: List<String>, question: String) {
        val msg = """
            Дай краткую трактовку для набора рун $runes в качестве ответа на вопрос 
            ```
            $question
            ```
        """.trimIndent()
    }

    fun tarotDesk(cards: List<String>, question: String) {
        val msg = """
            Дай краткую трактовку руны $cards в качестве ответа на вопрос 
            ```
            $question
            ```
        """.trimIndent()
    }
}