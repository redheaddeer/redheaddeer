package red.head.deer.oracle.cards

class Tarot {

    fun fool(): List<String> {
        val name = "Шут"
        val description = "Свежесть начала, стремление к свободе и риску."
        val revert = "Несерьезность, импульсивность, отсутствие планирования."
        val yesNo = true // Обычно воспринимается положительно

        return listOf(name, description, revert, "$yesNo")
    }

    fun magician(): List<String> {
        val name = "Маг"
        val description = "Мастерство, способность воплощать замыслы."
        val revert = "Неспособность реализовать планы, рассеянность."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun highPriestess(): List<String> {
        val name = "Верховная Жрица"
        val description = "Скрытые знания, интуитивные прозрения."
        val revert = "Замкнутость, пассивность, нежелание раскрыть потенциал."
        val yesNo = false

        return listOf(name, description, revert, "$yesNo")
    }

    fun empress(): List<String> {
        val name = "Императрица"
        val description = "Материнская забота, плодородие, творчество."
        val revert = "Недостаточная продуктивность, неуверенность в себе."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun emperor(): List<String> {
        val name = "Император"
        val description = "Авторитет, лидерство, структура и дисциплина."
        val revert = "Автократичность, чрезмерный контроль, закрытость."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun hierophant(): List<String> {
        val name = "Иерофант"
        val description = "Наставничество, традиционное мышление, мораль."
        val revert = "Отказ от принятия советов, конфликт с нормами."
        val yesNo = false

        return listOf(name, description, revert, "$yesNo")
    }

    fun lovers(): List<String> {
        val name = "Влюбленные"
        val description = "Любовь, партнёрские отношения, моральный выбор."
        val revert = "Проблемы выбора, нерешительность, дисгармония."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun chariot(): List<String> {
        val name = "Колесница"
        val description = "Успех, продвижение вперёд, преодоление препятствий."
        val revert = "Потеря контроля, застревание на месте, разочарование."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun strength(): List<String> {
        val name = "Сила"
        val description = "Самообладание, внутреннее спокойствие, мужество."
        val revert = "Агрессивность, слабость характера, подавленность."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun hermit(): List<String> {
        val name = "Отшельник"
        val description = "Уединение, саморефлексия, поиск мудрости."
        val revert = "Изоляция, страх одиночества, потеря направления."
        val yesNo = false

        return listOf(name, description, revert, "$yesNo")
    }

    fun wheelOfFortune(): List<String> {
        val name = "Колесо Фортуны"
        val description = "Изменчивость судьбы, циклическое развитие."
        val revert = "Чувство бессилия перед обстоятельствами, неудачи."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun justice(): List<String> {
        val name = "Справедливость"
        val description = "Объективность, справедливость, решение вопросов."
        val revert = "Неправедность, предвзятое мнение, нарушение закона."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun hangedMan(): List<String> {
        val name = "Повешенный"
        val description = "Остановка, новые перспективы, переходный период."
        val revert = "Застревание, упорство в неправильных действиях, апатия."
        val yesNo = false

        return listOf(name, description, revert, "$yesNo")
    }

    fun death(): List<String> {
        val name = "Смерть"
        val description = "Преобразование, конец прежнего состояния, начало нового."
        val revert = "Страх изменений, сопротивление изменениям, отказ от новых возможностей."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun temperance(): List<String> {
        val name = "Умеренность"
        val description = "Гармоничное сочетание противоположностей, баланс."
        val revert = "Экстремальность, нетерпеливость, несбалансированность."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun devil(): List<String> {
        val name = "Дьявол"
        val description = "Ограниченность, привязанности, эгоцентризм."
        val revert = "Освобождение от зависимостей, осознание ограниченности."
        val yesNo = false

        return listOf(name, description, revert, "$yesNo")
    }

    fun tower(): List<String> {
        val name = "Башня"
        val description = "Катастрофическое событие, крушение структуры."
        val revert = "Медленное изменение, сохранение стабильности."
        val yesNo = false

        return listOf(name, description, revert, "$yesNo")
    }

    fun star(): List<String> {
        val name = "Звезда"
        val description = "Надежда, вдохновение, возобновление жизненных сил."
        val revert = "Отсутствие веры, утрата надежды, недостаток энергии."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun moon(): List<String> {
        val name = "Луна"
        val description = "Обман, иллюзии, тревога, неясность."
        val revert = "Просветление, выход из иллюзий, обретение уверенности."
        val yesNo = false

        return listOf(name, description, revert, "$yesNo")
    }

    fun sun(): List<String> {
        val name = "Солнце"
        val description = "Свет, радость, здоровье, счастье."
        val revert = "Подавленность, депрессия, ухудшение здоровья."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun judgement(): List<String> {
        val name = "Суд"
        val description = "Открытие новых горизонтов, переворот сознания."
        val revert = "Уклонение от ответственности, непринятие решений."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }

    fun world(): List<String> {
        val name = "Мир"
        val description = "Завершение цикла, реализация желаний, гармония."
        val revert = "Недовольство достигнутым, ощущение незавершённости."
        val yesNo = true

        return listOf(name, description, revert, "$yesNo")
    }
}