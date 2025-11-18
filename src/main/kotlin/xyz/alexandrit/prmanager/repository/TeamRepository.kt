package xyz.alexandrit.prmanager.repository

import org.springframework.data.jpa.repository.JpaRepository
import xyz.alexandrit.prmanager.entity.Team

interface TeamRepository : JpaRepository<Team, Long>