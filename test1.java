fun stakeConfig(dto: StakeConfigDto): CommonResponse<StakeConfigResponse> {
    println("I love Kotlin :)")
    val stakeConfigResponse = StakeConfigResponse() // Corrected variable name
    return CommonResponse(data = stakeConfigResponse) // Wrapping response in CommonResponse
}
