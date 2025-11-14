package xyz.alexandrit.prmanager.dto

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull

data class PullRequestShortDto (
    @field:NotNull(message = "Pull Request ID is required")
    @param:JsonProperty("pull_request_id")
    var pullRequestId: String,

    @field:NotNull(message = "Pull Request Name is required")
    @param:JsonProperty("pull_request_name")
    var pullRequestName: String,

    @field:NotNull(message = "Author ID is required")
    @param:JsonProperty("author_id")
    var authorId: String,

    @field:NotNull(message = "Status is required")
    @param:JsonProperty("status")
    var status: PullRequestDto.Status,
)