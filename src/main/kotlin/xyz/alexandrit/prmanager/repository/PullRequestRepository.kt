package xyz.alexandrit.prmanager.repository

import org.springframework.data.jpa.repository.JpaRepository
import xyz.alexandrit.prmanager.entity.PullRequest

interface PullRequestRepository : JpaRepository<PullRequest, Long>