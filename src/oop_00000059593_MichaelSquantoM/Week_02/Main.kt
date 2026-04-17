import oop_00000059593_MichaelSquantoM.Week_02.Loan
import java.util.Scanner
import javax.xml.transform.Source

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // Consume newline

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            // Memanggil Primary Constructor
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
            println("Status: Pendaftaran Selesai.")

        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
            println("Status: Pendaftaran Selesai.")

        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

    fun main() {
        val scanner = Scanner(System.`in`)

        println("--- Sistem Perpustakaan ---")
        print("Judul Buku: ")
        val title = scanner.nextLine()
        print("Nama Peminjam: ")
        val name = scanner.nextLine()
        print("Lama Pinjam (hari): ")
        var duration = scanner.nextInt()

        // Validasi: Jika minus, otomatis ubah jadi 1
        if (duration < 0) {
            duration = 1
        }

        val loan = Loan(title, name, duration)

        println("\n--- Detail Peminjaman ---")
        println("Judul: ${loan.bookTitle}")
        println("Peminjam: ${loan.borrower}")
        println("Durasi: ${loan.loanDuration} hari")
        println("Total Denda: Rp ${loan.calculateFine()}")
    }
}