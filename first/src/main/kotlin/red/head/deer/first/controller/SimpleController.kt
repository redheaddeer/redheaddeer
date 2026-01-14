package red.head.deer.first.controller

import jakarta.servlet.http.HttpServletResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import red.head.deer.first.service.SimpleService

@RestController
class SimpleController {

    @PostMapping("/start")
    fun start(): Any {
        SimpleService.KLogger.startService()
        return HttpServletResponse.SC_FOUND
    }
}