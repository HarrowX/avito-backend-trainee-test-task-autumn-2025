package xyz.alexandrit.prmanager.dto

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class PullRequestDto (
    @param:JsonProperty("pull_request_id")
    @field:NotNull(message = "Pull Request ID is required")
    var pullRequestId: String,

    @param:JsonProperty("pull_request_name")
    @field:NotNull(message = "Pull Request Name is required")
    var pullRequestName: String,

    @param:JsonProperty("author_id")
    @field:NotNull(message = "Author ID is required")
    var authorId: String,

    @param:JsonProperty("status")
    @field:NotNull(message = "Status is required")

    var status: Status,

    @param:JsonProperty("assigned_reviewers")
    @field:Size(min = 0, max = 2)
    @field:NotNull(message = "Assigned reviewers is required")
    var assignedReviewers: List<@NotNull(message = "Reviewer ID cannot be null") String>, //[userId1, userId2] // (0..2)


    @param:JsonProperty("createdAt") // как и в openapi.yaml
    val createdAt: String,

    @param:JsonProperty("mergedAt") // как и в openapi.yaml
    val mergedAt: String,
) {
    enum class Status {
        @JsonProperty("OPEN")
        OPEN,

        @JsonProperty("MERGED")
        MERGED
    }
}