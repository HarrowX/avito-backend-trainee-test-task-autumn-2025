package xyz.alexandrit.prmanager.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val id: Long = 0,

    @Column(name = "username", nullable = false, unique = true)
    val username: String,

    @Column(name = "is_active", nullable = false)
    val isActive: Boolean,

    @ManyToOne
    @JoinTable(
        name = "user_teams",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "team_id")]
    )
    val team: Team,

    @OneToMany(mappedBy = "author")
    val pullRequests: MutableSet<PullRequest> = mutableSetOf(),

    @ManyToMany(mappedBy = "reviewers")
    val reviewedPullRequests: MutableSet<PullRequest> = mutableSetOf()
)