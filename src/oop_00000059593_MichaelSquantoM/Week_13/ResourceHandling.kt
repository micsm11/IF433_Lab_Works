package oop_00000059593_MichaelSquantoM.Week_13

import java.io.File

fun main() {
    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log entry #$i: System status OK.")
        }
    }
    println("100 baris log berhasil di-generate dengan sangat aman.")

