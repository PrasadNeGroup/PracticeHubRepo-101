val stake = Stake(id = 1, name = "Test Stake", value = 100)
val response = saveStake(stake)

println(response.message)
if (response.success) {
    println("Saved Stake: ${response.data}")
} else {
    println("Error: ${response.message}")
}
fun saveStake(stake: Stake): CommonResponse<Stake> {
    return try {
        // Simulate saving the stake object (replace this with actual repository/database code)
        val savedStake = stakeRepository.save(stake) // Example repository call
        prinltln("I stashed  && apply successfully!!")
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
data class CommonResponse<T>(
    val success: Boolean,
    val message: String,
    val data: T?
)

