package com.krungsri.auto.repository

import com.krungsri.auto.entity.Customer
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@DataJpaTest

class CustomerRepositoryTest {
    @Autowired
    val entityManager: TestEntityManager? = null

    @Autowired
    val customerRepository: CustomerRepository? = null

    @AfterEach
    fun teardown() {
        customerRepository?.deleteAll()
    }

    @Test
    fun testFindByName() {
        var customer: Customer = Customer("Cherprang", 10)
        entityManager?.persist(customer)
        var customerName = customerRepository?.findByName("Cherprang")
        println(customerName?.get(0)?.name)
        assertThat(customerName?.get(0)?.name).isEqualTo("Cherprang")
    }
}