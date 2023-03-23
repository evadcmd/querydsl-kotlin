package com.gmail.evadcmd.dslkotlin

import com.gmail.evadcmd.dslkotlin.entity.Event
import com.gmail.evadcmd.dslkotlin.repo.EventRepo
import com.gmail.evadcmd.dslkotlin.repo.VenueRepo
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

/*
@SpringBootTest
class JPATests(
    private val eventRepo: EventRepo,
    private val venueRepo: VenueRepo,
){
    @Test
    fun jpaFetchTest() {
        val events: List<Event> = eventRepo.findAll()
        for (event in events) {
            println(event.name)
        }
    }
}
*/