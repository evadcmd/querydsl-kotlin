package com.gmail.evadcmd.dslkotlin.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*
import java.time.Duration
import java.time.ZonedDateTime

@Entity
data class Event(
    @Id
    @GeneratedValue
    val id: Long?,
    var name: String,
    var start: ZonedDateTime,
    var duration: Duration = Duration.ZERO,

    @JsonIgnoreProperties("events")
    @ManyToOne(fetch = FetchType.LAZY)
    val venue: Venue?,
)