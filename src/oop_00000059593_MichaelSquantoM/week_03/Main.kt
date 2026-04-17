package oop_00000059593_MichaelSquantoM.week_03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000 // Harusnya print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    fun main() {
        val sword = Weapon("Excalibur")

        sword.damage = -50

        sword.damage = 9999

        println("Senjata: ${sword.name}, Damage: ${sword.damage}, Tier: ${sword.tier}")
    }
}