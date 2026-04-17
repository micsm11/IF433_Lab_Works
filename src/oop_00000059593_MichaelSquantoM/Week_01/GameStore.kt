package oop_00000059593_MichaelSquantoM.Week_01

fun main() {
    val gameTitle = "Resident Evil 4 Remake"
    val price = 600000

    fun calculateDiscount(price: Int): Int = if (price > 500000) {
        (price * 0.20).toInt()
    } else {
        (price * 0.10).toInt()
    }

    fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
        println("=== STRUK PEMBELIAN STEAMKW ===")
        println("Judul Game  : $title")
        println("Harga Asli  : Rp $originalPrice")
        println("Harga Akhir : Rp $finalPrice")
    }

// Di dalam main():
    val discount = calculateDiscount(price)
    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = price - discount
    )
}
fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String?) {
    println("=== STRUK PEMBELIAN STEAMKW ===")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")

    println("Catatan     : ${note ?: "Tidak ada catatan"}")
}