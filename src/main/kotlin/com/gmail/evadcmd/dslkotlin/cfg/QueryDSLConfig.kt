package com.gmail.evadcmd.dslkotlin.cfg

import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class QueryDSLConfig {
    @Bean
    fun query(em: EntityManager): JPAQueryFactory {
        return JPAQueryFactory(em)
    }
}