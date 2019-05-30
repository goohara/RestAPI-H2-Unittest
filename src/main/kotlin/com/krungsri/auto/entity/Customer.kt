package com.krungsri.auto.entity

import javax.persistence.*

@Entity
@Table(name = "customer")
class Customer(
        var name: String? = null,
        var quantity: Int? = 0,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = 0
) {
    constructor(): this("")
}
