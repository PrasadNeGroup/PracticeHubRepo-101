fun stakeConfig(dto: StakeConfigDto): CommonResponse<StakeConfigResponse> {
    println("I love Kotlin :)")
    val stakeConfigResponse = StakeConfigResponse() // Corrected variable name
    println("StakeConfigResponse object is created!!")
    return CommonResponse(data = stakeConfigResponse) // Wrapping response in CommonResponse
}
