package xyz.alexandrit.prmanager.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ErrorResponseDto(
    @param:JsonProperty("error")
    val error: ErrorDetail
) {
    data class ErrorDetail(
        @param:JsonProperty("code")
        val code: ErrorCode,

        @param:JsonProperty("message")
        val message: String
    )

    enum class ErrorCode {
        @JsonProperty("TEAM_EXISTS")
        TEAM_EXISTS,

        @JsonProperty("PR_EXISTS")
        PR_EXISTS,

        @JsonProperty("PR_MERGED")
        PR_MERGED,

        @JsonProperty("NOT_ASSIGNED")
        NOT_ASSIGNED,

        @JsonProperty("NO_CANDIDATE")
        NO_CANDIDATE,

        @JsonProperty("NOT_FOUND")
        NOT_FOUND
    }
}