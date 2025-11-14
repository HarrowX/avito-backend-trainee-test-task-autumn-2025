package xyz.alexandrit.prmanager.dto

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull

data class TeamDto(
    @param:JsonProperty("team_name")
    @field:NotNull(message = "Team name is required")
    var teamName: String,

    @param:JsonProperty("members")
    @field:NotNull(message = "Members is required")
    var members: List<TeamMemberDto>
)

