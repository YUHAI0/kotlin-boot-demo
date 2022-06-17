package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class UserProfile(@Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long=100,
                  val name: String = "",
                  val salary: Int = 2000) {
}