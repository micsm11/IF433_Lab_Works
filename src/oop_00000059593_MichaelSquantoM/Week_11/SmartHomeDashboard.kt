package oop_00000059593_MichaelSquantoM.Week_11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also { homeDevices.add(it) }
}