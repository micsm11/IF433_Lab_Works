package oop_00000059593_MichaelSquantoM.week_03

package oop_001_johnthor.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}