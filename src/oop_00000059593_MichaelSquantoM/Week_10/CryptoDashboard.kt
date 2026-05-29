package oop_00000059593_MichaelSquantoM.Week_10

data class Coin(override val name: String, val balance: Double) : NamedEntity
data class Transaction(override val name: String, val amount: Double) : NamedEntity