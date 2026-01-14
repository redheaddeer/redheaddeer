package red.head.deer.first.controller

import jakarta.servlet.http.HttpServletResponse
import org.springframework.web.bind.annotation.PostMapping
import red.head.deer.first.service.SimpleService

class SimpleController {

    @PostMapping("/start")
    fun start(): Any {
        println("Start test")
        SimpleService.KLogger.startService()
        return HttpServletResponse.SC_FOUND
    }
}