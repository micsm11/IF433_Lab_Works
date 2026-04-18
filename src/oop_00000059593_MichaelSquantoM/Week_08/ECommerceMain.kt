package oop_00000059593_MichaelSquantoM.Week_08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    println("=== PROCESSING E-COMMERCE BATCH ===")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                when (it) {
                    is Electronic -> println("Processing: ${it.name} (Warranty: ${it.warrantyMonths})")
                    is Clothing -> println("Processing: ${it.name} (Size: ${it.size})")
                }
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("LOG ERROR: Data korup terdeteksi! ${e.message}")
        }

}