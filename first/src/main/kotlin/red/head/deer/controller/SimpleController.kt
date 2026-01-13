package red.head.deer.controller

import jakarta.servlet.http.HttpServletResponse
import org.springframework.web.bind.annotation.PostMapping
import red.head.deer.service.SimpleService

class SimpleController {

    @PostMapping("/start")
    fun start(): Any {
        println("Start test")
        SimpleService.startService()
        return HttpServletResponse.SC_FOUND
    }
}