package oop_00000059593_MichaelSquantoM.Week_10

interface Cryptodashboard {
    val name: String
}

data class Coin(override val name: String, val balance: Double) : NamedEntity

data class Transaction(override val name: String, val amount: Double) : NamedEntity