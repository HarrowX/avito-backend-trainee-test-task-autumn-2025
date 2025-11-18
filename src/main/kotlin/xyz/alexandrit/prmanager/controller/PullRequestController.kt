package xyz.alexandrit.prmanager.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pullRequests")
class PullRequestController {


    @PostMapping("/create")
    fun create() {TODO()}

    @PostMapping("/merge")
    fun merge() {TODO()}

    @PostMapping("/reassign")
    fun reassign() {TODO()}
}