package xyz.alexandrit.prmanager.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/team")
class TeamController {

    @PostMapping("/add")
    fun add() {TODO()}

    @GetMapping("/get")
    fun get() {TODO()}

}