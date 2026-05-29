package oop_00000059593_MichaelSquantoM.Week_10

data class Coin(override val name: String, val balance: Double) : NamedEntity
data class Transaction(override val name: String, val amount: Double) : NamedEntity

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 5.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())