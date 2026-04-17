package oop_00000059593_MichaelSquantoM.Week_06

class Smartphone : Camera, Phone {

        override fun turnOn() {
            super<Camera>.turnOn ()
            super<Phone>.turnOn ()
            println("Sistem operasi Smartphone berhasil booting.")

    }
}
