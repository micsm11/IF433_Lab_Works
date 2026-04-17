package oop_00000059593_MichaelSquantoM.Week_02

class Student (
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String

){
    constructor(name:String,  nim:String) : this(name, nim, "Non-Matriculated")
    println("Log: Mmenggunakan constructor jalur semua umum (Tanpa jurusan)")

    class Student (val name: String, val nim: String, var major: String) {
        init {
            // Validasi Sederhana: Cek panjang NIM
            if (nim.length != 5) {
                println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
                println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
            } else {
                println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
            }
        }
    }}