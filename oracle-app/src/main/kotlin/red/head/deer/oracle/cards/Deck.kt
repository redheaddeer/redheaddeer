package red.head.deer.oracle.cards

import red.head.deer.oracle.cards.major.*
import red.head.deer.oracle.cards.minor.coins.*
import red.head.deer.oracle.cards.minor.cups.*
import red.head.deer.oracle.cards.minor.swords.*
import red.head.deer.oracle.cards.minor.wands.*

class Deck {
    val majorArcane = listOf(
        Tarot().chariot(),
        Tarot().death(),
        Tarot().devil(),
        Tarot().emperor(),
        Tarot().empress(),
        Tarot().fool(),
        Tarot().hangedMan(),
        Tarot().hermit(),
        Tarot().hierophant(),
        Tarot().highPriestess(),
        Tarot().judgement(),
        Tarot().justice(),
        Tarot().lovers(),
        Tarot().magician(),
        Tarot().moon(),
        Tarot().star(),
        Tarot().strength(),
        Tarot().sun(),
        Tarot().temperance(),
        Tarot().tower(),
        Tarot().wheelOfFortune(),
        Tarot().world(),
    )

    val coinsDeck = listOf(
        AceOfCoins().name,
        EightOfCoins().name,
        FiveOfCoins().name,
        FourOfCoins().name,
        KingOfCoins().name,
        KnightOfCoins().name,
        NineOfCoins().name,
        PageOfCoins().name,
        QueenOfCoins().name,
        SevenOfCoins().name,
        SixOfCoins().name,
        TenOfCoins().name,
        ThreeOfCoins().name,
        TwoOfCoins().name,
    )

    val cupsDeck = listOf(
        AceOfCups().name,
        EightOfCups().name,
        FiveOfCups().name,
        FourOfCups().name,
        KingOfCups().name,
        KnightOfCups().name,
        NineOfCups().name,
        PageOfCups().name,
        QueenOfCups().name,
        SevenOfCups().name,
        SixOfCups().name,
        TenOfCups().name,
        ThreeOfCups().name,
        TwoOfCups().name,
    )

    val swordsDeck = listOf(
        AceOfSwords().name,
        EightOfSwords().name,
        FiveOfSwords().name,
        FourOfSwords().name,
        KingOfSwords().name,
        KnightOfSwords().name,
        NineOfSwords().name,
        PageOfSwords().name,
        QueenOfSwords().name,
        SevenOfSwords().name,
        SixOfSwords().name,
        TenOfSwords().name,
        ThreeOfSwords().name,
        TwoOfSwords().name,
    )

    val wandsDeck = listOf(
        AceOfWands().name,
        EightOfWands().name,
        FiveOfWands().name,
        FourOfWands().name,
        KingOfWands().name,
        KnightOfWands().name,
        NineOfWands().name,
        PageOfWands().name,
        QueenOfWands().name,
        SevenOfWands().name,
        SixOfWands().name,
        TenOfWands().name,
        ThreeOfWands().name,
        TwoOfWands().name,
    )

    val minorArcane = coinsDeck + cupsDeck + swordsDeck + wandsDeck

    val fullDeck = majorArcane + minorArcane

}