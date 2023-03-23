package com.gmail.evadcmd.dslkotlin.ctl

import com.gmail.evadcmd.dslkotlin.entity.Event
import com.gmail.evadcmd.dslkotlin.repo.EventRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/event")
class EventCtl(private val eventRepo: EventRepo) {
    @GetMapping
    fun getHandler(): List<Event> {
        return eventRepo.findAll()
    }
}