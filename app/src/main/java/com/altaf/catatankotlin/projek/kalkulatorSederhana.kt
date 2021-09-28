package com.altaf.catatankotlin.projek

fun main() {
//  menu operasi
    println("Pilih perhitungan:")
    println("1.Penjumlahan")
    println("2.Pengurangan")
    println("3.Perkalian")
    println("4.Pembagian")

    calculator()




}
fun calculator(){

    println("Masukkan pilihan:")
    var pilihan = readLine()!!.toInt() // readline adlaah string maka kita ubah ke Int karena yang kita input adalah angkla

    // Masukkan angka pertama
    println("masukkan angka pertama:")
    var noSatu = readLine()!!.toInt()
    //masukkan angka kedua
    println("masukkan angka kedua:")
    var noKedua = readLine()!!.toInt()



    if (pilihan == 1){
        var penjumlahan = noSatu + noKedua
        println("Hasil $noSatu + $noKedua = $penjumlahan")

    }else if (pilihan == 2){
        var pengurangan = noSatu - noKedua
        println("hasil $noSatu - $noKedua = $pengurangan")

    }else if (pilihan == 3){
        var perkalian =  noSatu * noKedua
        println("hasil $noSatu + $noKedua = $perkalian")
    }else if (pilihan == 4) {
        var pembagian = noSatu.toDouble()  / noKedua.toDouble()
        println("Hasil $noSatu / $noKedua = $pembagian")
    }else{
        println("Coba lagi!!")
    }
}