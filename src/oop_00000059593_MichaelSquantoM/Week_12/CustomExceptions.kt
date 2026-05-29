package oop_00000059593_MichaelSquantoM.Week_12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")