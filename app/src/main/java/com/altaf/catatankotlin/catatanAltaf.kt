package com.altaf.catatankotlin

const val CAR = "Tesla"
//const val adalah variabel global yang tidak bisa diubah
//variabel global adalah variabel yang bisa dipanggil dimana saja (di berbagai function)
//Biasanya penamaan variabel constant biasanhya menggunakan UPPER_CASE



fun main() {
    //fun main adalah function utama, maka untuk memanggil function lainnya maka hanya bisa di akses di fun main
    println(variabel())
    println(nullable())
    println(CAR)
    println(tipDatNumber())

}

fun variabel() : String {
    println("===============variabel==============")
    val firstName : String = "Altaf "
    //val adalah variabel yang tidak bisa diganti

    var lastName : String = "Shua "
    //var adalah variabel yang isinya bisa diganti
    lastName = "Ilham"

    return firstName
}

fun nullable() {
    println("===============Nullable==============")
    // nullable
    // nullable berfungsi untuk mengisi variabel yang kosong
    // nullable = menggunakan tanda tanya (?) di akhir tipe data

     var vNullSatu : String? = null
    // var adalah variabel yang tidak bisa di ganti maka null akan tetap ngeprint tulisan "null"

    var vNullDua : String? = null
    vNullDua = "contoh null"

    println(vNullSatu)
    println(vNullDua)

}

fun tipDatNumber() {
    println("============== Tipe Data Number ================")
    // tipe data number mempengaruhi memori aplikasi yang dibuat

    // Tipe data Byte

    var byte : Byte = Byte.MAX_VALUE
    println("nilai maksimal dari Byte: $byte")

    byte = Byte.MIN_VALUE
    println("nilai minimal  dari Byte: $byte")

    // Tipe data Short

    var short : Short =  Short.MAX_VALUE
    println("Nilai maksimal dari Short: $short")

    short = Short.MIN_VALUE
    println("Nilai minimal dari Short: $short")

    // Tipe data integer(Int)
    var integer : Int = Int.MAX_VALUE
    println("Nilai maksimal dari Int: $integer")

    integer = Int.MIN_VALUE
    println("Nilai minimal dari Int: $short")

    // Tipe data Long
    var long : Long = Long.MAX_VALUE
    println("Nilai maksimal dari Long: $long")

    long = Long.MIN_VALUE
    println("Nilai minimal dari Long: $long")


}




