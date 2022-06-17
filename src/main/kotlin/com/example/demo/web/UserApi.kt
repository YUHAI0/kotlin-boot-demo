package com.example.demo.web

import com.example.demo.entity.UserProfile
import com.example.demo.repo.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//@RestController
//@RequestMapping("/api/users")
class UserApi  {

    @Autowired
    lateinit var userRepository: UserRepository

    @GetMapping("/all")
    fun getAll() : List<UserProfile> = userRepository.findAll().toList()
}

