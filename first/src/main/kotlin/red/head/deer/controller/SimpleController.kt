package red.head.deer.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("v1")
class SimpleController {

    @GetMapping("/start")
    fun start() {}
}