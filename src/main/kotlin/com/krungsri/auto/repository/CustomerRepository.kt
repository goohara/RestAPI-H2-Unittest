package com.krungsri.auto.repository

import com.krungsri.auto.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Long> {
    abstract fun findByName(name: String): List<Customer>
}
