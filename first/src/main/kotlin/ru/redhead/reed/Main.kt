package ru.redhead.reed

class Main {
    companion object KLogging {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello and welcome!")

            for (i in 1..5) {
                println("i = $i")
            }
        }
    }
}