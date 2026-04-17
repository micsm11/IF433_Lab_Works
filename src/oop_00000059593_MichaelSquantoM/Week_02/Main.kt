import oop_00000059593_MichaelSquantoM.Week_02.Hero
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
    {
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

    fun main() {
        val scanner = Scanner(System.`in`)

        println("--- Setup Hero ---")
        print("Masukkan Nama Hero: ")
        val heroName = scanner.nextLine()
        print("Masukkan Base Damage: ")
        val damage = scanner.nextInt()

        val myHero = Hero(heroName, damage)
        var enemyHp = 100

        println("\n--- BATTLE START: vs Slime ---")

        while (myHero.isAlive() && enemyHp > 0) {
            println("\nHP Kamu: ${myHero.hp} | HP Musuh: $enemyHp")
            println("Aksi: 1. Serang, 2. Kabur")
            print("Pilih: ")

            when (scanner.nextInt()) {
                1 -> {
                    myHero.attack("Slime")
                    enemyHp -= myHero.baseDamage
                    println("HP Musuh tersisa: $enemyHp")

                    if (enemyHp > 0) {
                        val enemyAtk = (10..20).random()
                        println("Slime menyerang balik sebesar $enemyAtk damage!")
                        myHero.takeDamage(enemyAtk)
                    }
                }
                2 -> {
                    println("Kamu melarikan diri dari pertempuran!")
                    break
                }
                else -> println("Pilihan tidak valid!")
            }
        }

        println("\n--- HASIL AKHIR ---")
        if (enemyHp <= 0) {
            println("Selamat! ${myHero.name} Menang!")
        } else if (!myHero.isAlive()) {
            println("GAME OVER... ${myHero.name} telah gugur.")
        } else {
            println("Pertempuran berakhir karena kamu kabur.")
        }
    }
}