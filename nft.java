fun processNetBankingWithUpi(
    netBankingDetails: NetBankingDetails,
    upiDetails: UpiDetails,
    amount: Double
): CommonResponse<TransactionResponse> {
    return try {
        // Validate inputs
        require(amount > 0) { "Transaction amount must be greater than zero." }
        require(netBankingDetails.isValid() && upiDetails.isValid()) { "Invalid net banking or UPI details." }

        // Simulate processing net banking
        println("Processing net banking transaction...")
        val netBankingSuccess = processNetBanking(netBankingDetails, amount)
        
        // Simulate processing UPI transaction
        println("Processing UPI transaction...")
        val upiSuccess = processUpi(upiDetails, amount)

        if (netBankingSuccess && upiSuccess) {
            // Success response
            CommonResponse(
                success = true,
                message = "Transaction completed successfully using Net Banking and UPI.",
                data = TransactionResponse(
                    transactionId = generateTransactionId(),
                    status = "SUCCESS",
                    amount = amount
                )
            )
        } else {
            throw Exception("Transaction failed at either Net Banking or UPI stage.")
        }
    } catch (e: Exception) {
        // Failure response
        CommonResponse(
            success = false,
            message = "Transaction failed: ${e.message}",
            data = null
        )
    }
}
