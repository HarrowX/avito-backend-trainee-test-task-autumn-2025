package xyz.alexandrit.prmanager.dto

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull

data class TeamMemberDto (
    @param:JsonProperty("user_id")
    @field:NotNull(message = "User ID is required")
    var userId: String,

    @param:JsonProperty("username")
    @field:NotNull(message = "Username is required")
    var username: String,

    @param:JsonProperty("is_active")
    @field:NotNull(message = "Is Active is required")
    var isActive: Boolean
)