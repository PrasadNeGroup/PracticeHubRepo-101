fun stakeConfig(dto: StakeConfigDto): CommonResponse<StakeConfigResponse> {
    println("I love Kotlin :)")
    val stakeConfigResponse = StakeConfigResponse() // Corrected variable name
   println("I love the collabarotors concept here!! beautiful")
    return CommonResponse(data = stakeConfigResponse) // Wrapping response in CommonResponse
}
fun saveStake(stake: Stake): CommonResponse<Stake> {
    return try {
        // Simulate saving the stake object (replace this with actual repository/database code)
        val savedStake = stakeRepository.save(stake) // Example repository call

        // Return success response
        CommonResponse(
            success = true,
            message = "Stake saved successfully.",
            data = savedStake
        )
    } catch (e: Exception) {
        // Handle errors and return failure response
        CommonResponse(
            success = false,
            message = "Failed to save stake: ${e.message}",
            data = null
        )
    }
}
