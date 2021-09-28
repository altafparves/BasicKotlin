package com.altaf.catatankotlin.tipedata

fun main() {
    val ikan : Array<String> = arrayOf ("oscar" , "toman", "belida") //
    // harus selalu menggunakan tipedata. Jika tipe datanya adalah string maka tulis string
    // jika isi dari variabel ada lebih dari 1 tipe data, maka tulis dgn <Any>

    for (i in ikan) { // untuk ngeprint isi variabel maka harus ngeprint dengan for
        println(i)
    }

    print("============= mengubah dan mendapatkan data==============")
    val tanggal : Array<Any> = arrayOf("Senin", 25, "Desember", 2005)
    //index adalah posisi sebuah kata dalam variabel

    //size
    println(tanggal.size) // .size berfungsi untuk mengetahui banyakn data dalam variabel
    //mendapat data
    println(tanggal[3]) // [index] berfungsi untuk mendapat data di posisi index
    //mendapat data
    println(tanggal.get(3)) // .get(index) berfungsi untuk mendapat data di posisi index
    // megubah data
    tanggal.set(0, "jumat") // .set(index, "kata yang mau diganti") berfungsi untuk mengubah data
    println(tanggal[0])                       // dari index yang ditulis

    tanggal[3]= "oktober" // [index]= "value" berfungsi untuk mengubah data dari index
    println(tanggal[3])


    println("==============arrayOfNulls==============")
    val kosong : Array<Any?> = arrayOfNulls(2)
    kosong.set(0, null)
    kosong.set(1,null)

    for (i in kosong){
        println(i)
    }


}