package oop_00000059593_MichaelSquantoM.Week_03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelum = level
            xp += amount

            if (level > levelSebelum) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}