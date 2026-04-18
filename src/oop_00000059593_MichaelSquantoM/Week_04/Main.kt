package oop_00000059593_MichaelSquantoM.Week_04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myEV = ElectricCar("Tesla", 2, 95)
    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("Andi", 8000000)
    val developer = Developer("Budi", 6000000, "Kotlin")

    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}
