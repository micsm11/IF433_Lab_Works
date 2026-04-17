package oop_00000059593_MichaelSquantoM.Week_05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar $amount Berhasil.")
        } else {
            println("[$accountName] Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil Top Up: $amount. Saldo baru: $balance")
    }
}