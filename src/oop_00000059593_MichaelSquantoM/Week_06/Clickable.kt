package oop_00000059593_MichaelSquantoM.Week_06

interface Clickable {
    val name: String
    fun click()

    class Button(override val name: String) : Clickable {
        override fun click() {
            println("Tombol '$name' berhasil diklik!")
        }
    }
}