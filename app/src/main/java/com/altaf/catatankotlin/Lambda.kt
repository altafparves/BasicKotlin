package com.altaf.catatankotlin

// belajar lambda
// Lambda adalah fungtion tanpa nama
// Lambda bertujuan untuk mempersingkat penulisan function
// lambda harus dipanggil di fun main krn masih sm seperti function

fun main() {
    pesan()
    printMessage("Halo kaum pemalas") // jika menggunakan parameter maka mengisi yg ingin di output di saat manggil fungsi

    val length = panjangKalimat("Hello makhluk bumi") // panjangKalimat berfungsi untuk mengakses kalimat.length di fungsi panjangKalimat untuk menghitung panjang kalimat "hello mahluk bumi"
    println("panjang kalimat $length")

    kalkulator()

    apaan("oke",9)

}

// bentuk function dibuah menjadi lambda
val pesan = {println("Hello bumi")}

    //Lambda menggunakan parameter
val printMessage = {message : String -> println(message)} // parameter nya (message :String)

val panjangKalimat = {kalimat :String -> kalimat.length}

var kalkulator = {
    println("=================readLine============")
    //Mengambil input dari fungsi readline()
    println("Isi nama: ")
    val nama = readLine()
    println("isi umur:")
    val umur = readLine()

    println("Nama saya $nama. Saya berumur $umur tahun ")
}

val apaan = {apaAja : String, iniAngka : Int ->
    println(apaAja)
    println(iniAngka)
}