fun stakeConfig(dto: StakeConfigDto): CommonResponse<StakeConfigResponse> {
    println("I love Kotlin :)")
    val stakeConfigResponse = StakeConfigResponse() // Corrected variable name
   println("I love the collabarotors concept here!! beautiful")
    return CommonResponse(data = stakeConfigResponse) // Wrapping response in CommonResponse
}

