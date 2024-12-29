data class CommonResponse<T>(
    val success: Boolean,
    val message: String,
    val data: T?
)
