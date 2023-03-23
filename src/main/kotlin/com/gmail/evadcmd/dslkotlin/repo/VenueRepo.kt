package com.gmail.evadcmd.dslkotlin.repo

import com.gmail.evadcmd.dslkotlin.entity.Venue
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor

interface VenueRepo: JpaRepository<Venue, Long>, QuerydslPredicateExecutor<Venue>{
}