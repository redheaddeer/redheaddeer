package red.head.deer.tarot.controller

import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import red.head.deer.tarot.service.SimpleService

@RestController
class SimpleController {

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
}