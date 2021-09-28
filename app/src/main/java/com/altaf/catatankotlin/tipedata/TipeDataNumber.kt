package com.altaf.catatankotlin
fun main() {

    println("===========Literal constant========")
// Literal constant
    var decimalLiteral = 800
    var heksaDesimalLiteral = 0x0f
    var binaryLiteral = 0b00001011

    println(decimalLiteral)
    println(heksaDesimalLiteral)
    println(binaryLiteral)


    // underscore
    println("======== Underscore========")
    var underscore = 200_400_500
    println(underscore)
    // underscore berfungsi untuk membantu kita membaca angka yang panjang
    //ika di print output yang keluar adalah angka saja tanpa underscore

    println("============conversition==========")
    //Conversition
    var angka : Int = 239_492_568
    val float : Float = angka.toFloat()
    println(float)

    println("==========character=========")
    // character berfungsi untuk ngeprint hanya satu huruf
    val karakter : Char = 's'
    // dia hanya menggunakan tanda petik satu
    println(karakter)


}