package com.example.demo.repo

import com.example.demo.entity.UserProfile
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
interface UserRepository : CrudRepository<UserProfile, Long> {
}