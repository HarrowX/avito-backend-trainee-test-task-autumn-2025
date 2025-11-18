package xyz.alexandrit.prmanager.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/team")
class UserController {

    @PostMapping("/setIsActive")
    fun setIsActive() {TODO()}

    @GetMapping("/getReview")
    fun getReview() {TODO()}
}