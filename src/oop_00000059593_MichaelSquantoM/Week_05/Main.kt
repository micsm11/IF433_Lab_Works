package oop_00000059593_MichaelSquantoM.Week_05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting
            }
            is Admin -> {
                println("-> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    println("\n=== TUGAS 1: OVERLOADING ===")
    val math = MathHelper()
    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (5x10): ${math.hitungLuas(5, 10)}")
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")
}