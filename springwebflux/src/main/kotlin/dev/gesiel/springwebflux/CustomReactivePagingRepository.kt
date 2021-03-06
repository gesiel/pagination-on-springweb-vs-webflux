package dev.gesiel.springwebflux

import java.io.Serializable
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux

@NoRepositoryBean
interface CustomReactivePagingRepository<T, ID : Serializable>
    : ReactiveCrudRepository<T, ID> {

    fun findAll(pageable: Pageable): Flux<T>

}