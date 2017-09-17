package org.calaedo.kotlinspringbootwartest.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import java.util.concurrent.atomic.AtomicInteger

@Controller

class IndexController {

    val atomic: AtomicInteger = AtomicInteger(0)

    @GetMapping("/")
    fun indexGet(model: Model): String {
        model.addAttribute("data", atomic.get())
        return "index"
    }

    @PostMapping("/")
    fun indexPost(model: Model): String {
        atomic.incrementAndGet()
        return "redirect:/"
    }

}