package oop_00000059593_MichaelSquantoM.Week_05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}