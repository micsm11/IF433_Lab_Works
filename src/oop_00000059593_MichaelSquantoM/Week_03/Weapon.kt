package oop_00000059593_MichaelSquantoM.Week_03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("PERINGATAN: Damage tidak boleh negatif! Nilai tetap: $field")
                // field tidak berubah (jangan ubah nilai aslinya)
            } else if (value > 1000) {
                println("PERINGATAN: Damage terlalu besar (Overpowered)! Dipaksa ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}