package com.gmail.evadcmd.dslkotlin

import com.gmail.evadcmd.dslkotlin.entity.Event
import com.gmail.evadcmd.dslkotlin.entity.Venue
import com.gmail.evadcmd.dslkotlin.repo.EventRepo
import com.gmail.evadcmd.dslkotlin.repo.VenueRepo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class JPATests{
    @Autowired
    lateinit var eventRepo: EventRepo
    @Autowired
    lateinit var venueRepo: VenueRepo

    @Test
    fun jpaFetchTest1() {
        val events: List<Event> = eventRepo.findAll()
        for (event in events) {
            println(event.name)
        }
    }

    @Test
    fun jpaFetchTest2() {
        val venues: List<Venue> = venueRepo.findAll()
        for (venue in venues) {
            println(venue.addr)
        }
    }
}