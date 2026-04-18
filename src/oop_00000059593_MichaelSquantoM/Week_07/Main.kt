package oop_00000059593_MichaelSquantoM.Week_07

fun main() {
    // --- TEST SINGLETON ---
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    // --- TEST COMPANION OBJECT ---
    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()
}