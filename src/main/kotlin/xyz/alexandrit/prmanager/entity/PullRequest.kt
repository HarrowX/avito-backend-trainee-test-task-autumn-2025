package xyz.alexandrit.prmanager.entity

import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
@Table(name = "teams")
class PullRequest(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    val id: Long = 0,

    @Column(name = "team_name", nullable = false, unique = true)
    val teamName: String,

    @OneToMany(mappedBy = "team")
    val users: MutableSet<User> = mutableSetOf()
)