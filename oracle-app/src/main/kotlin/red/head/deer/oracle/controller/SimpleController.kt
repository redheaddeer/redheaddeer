package red.head.deer.oracle.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import red.head.deer.oracle.service.SimpleService

@RestController
class SimpleController {

    @GetMapping("/get-title")
    fun getTitle(): Any {
        return ResponseEntity.ok().body(SimpleService.getTitle())
    }

    @PostMapping("/start")
    fun start(): Any {
        println("Start test")
        SimpleService.startService()
        return ResponseEntity.ok().body("TarotApp was started")
    }

    @GetMapping("/day-prophecy")
    fun dayProphecy(): Any {
        val res = "Ваша карта дня... ${SimpleService.dayProphecy()}"
        return ResponseEntity.ok().body(res)
    }

    @GetMapping("/set-locale")
    fun setLocale(
        @RequestParam(name = "locale", value = "", required = true) locale: String
    ): Any {
        val acceptLocale: List<String> = listOf("en", "ru")
        if (acceptLocale.contains(locale)) {
            SimpleService.setLocale(locale)
            return ResponseEntity.ok().contentType( org.springframework.http.MediaType.TEXT_PLAIN)
        } else return ResponseEntity.notFound()
    }

}