package oop_00000059593_MichaelSquantoM.Week_14

import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double)
}

class CsvOrderRepository : OrderRepository {

    private val file = File("orders.csv")

    override fun saveOrder(
        itemName: String,
        finalPrice: Double
    ) {
        file.appendText("$itemName,$finalPrice\n")
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricingStrategy: PricingStrategy
    ) {

        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice)

        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}

fun main() {

    val repo = CsvOrderRepository()
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(repo, notifier)

    processor.processOrder(
        "Laptop Gaming",
        15000000.0,
        VipPricing()
    )

    processor.processOrder(
        "Mouse Wireless",
        250000.0,
        RegularPricing()
    )
}