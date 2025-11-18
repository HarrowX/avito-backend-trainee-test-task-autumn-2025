package xyz.alexandrit.prmanager.request

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull

data class SetIsActiveDto(
    @field:NotNull(message = "User ID Name is required")
    @param:JsonProperty("user_id")
    var userId: Long,
    @field:NotNull(message = "Is active is required")
    @param:JsonProperty("is_active")
    var isActive: Boolean
)
