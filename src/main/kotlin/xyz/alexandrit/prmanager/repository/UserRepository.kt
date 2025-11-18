package xyz.alexandrit.prmanager.repository

import org.springframework.data.jpa.repository.JpaRepository
import xyz.alexandrit.prmanager.entity.User

interface UserRepository : JpaRepository<User, Long>