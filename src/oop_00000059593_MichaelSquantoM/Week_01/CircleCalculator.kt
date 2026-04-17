package oop_00000059593_MichaelSquantoM.Week_01

fun main() {
    var radius = 7.0
    var pi = 3.14
    var area = pi * radius * radius

    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) {
    "This is a Big Circle"
} else {
    "This is a Small Circle"
}