package com.gmail.evadcmd.dslkotlin.ctl

import com.gmail.evadcmd.dslkotlin.entity.Venue
import com.gmail.evadcmd.dslkotlin.repo.VenueRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/venue")
class VenueCtl(private val venueRepo: VenueRepo) {
    @GetMapping
    fun getHandler(): List<Venue> {
        return venueRepo.findAll()
    }
}