package com.gmail.evadcmd.dslkotlin.repo

import com.gmail.evadcmd.dslkotlin.entity.Venue
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.querydsl.QuerydslPredicateExecutor

interface VenueRepo: JpaRepository<Venue, Long>, QuerydslPredicateExecutor<Venue>{
    @Query("SELECT v FROM Venue v LEFT JOIN FETCH v.events")
    override fun findAll(): List<Venue>
}