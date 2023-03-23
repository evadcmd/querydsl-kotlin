package com.gmail.evadcmd.dslkotlin.repo

import com.gmail.evadcmd.dslkotlin.entity.Event
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor

interface EventRepo: JpaRepository<Event, Long>, QuerydslPredicateExecutor<Event> {
}