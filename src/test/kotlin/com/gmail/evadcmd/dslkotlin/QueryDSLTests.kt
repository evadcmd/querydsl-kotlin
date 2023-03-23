package com.gmail.evadcmd.dslkotlin

import com.gmail.evadcmd.dslkotlin.entity.QEvent.event
import com.gmail.evadcmd.dslkotlin.entity.QVenue.venue
import com.gmail.evadcmd.dslkotlin.entity.Venue
import com.querydsl.jpa.impl.JPAQueryFactory
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class QueryDSLTests {
    @Autowired
    lateinit var query: JPAQueryFactory

    @Test
    fun queryDSLTest1() {
        // n + 1 problem ?
        val venues: List<Venue> = query.selectFrom(venue).join(event).where(event.id.`in`(52L)).fetch()
        for (venue in venues) {
            println(venue.addr)
        }
    }
}