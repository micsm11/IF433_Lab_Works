package oop_00000059593_MichaelSquantoM.week_03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Ini akan meledakkan program Anda
}