package com.gmail.evadcmd.dslkotlin.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
data class Venue(
    @Id
    @GeneratedValue
    val id: Long?,
    var addr: String = "",

    @JsonIgnoreProperties("venue")
    @OneToMany(mappedBy = "venue")
    val events: List<Event>?,
)