package com.altaf.catatankotlin

fun main() {
//  list bisa menampung smua tipe data
    val numberList = listOf (1,2,3,4,5)
    val charList = listOf('b','e','m')
    val anyList = listOf('a', "kalibre", 25, false)

    println(numberList)
    println(anyList)
    println(anyList[1]) // konsep nya sama dengan array saat indexing saat ingin mengambil salah satu data

    val smuaList = mutableListOf('z', 15, "macbook pro", false)  // mutableLiistof berfungsi agar data di list bisa diotak atik (hapus, nambah, ubah)

    smuaList.add('A')   // berfungsi untuk menambah item di akhir list
    println(smuaList)

    smuaList.add( 1, "altaf")  //berfungsi untuk menambah item di index 1
    println(smuaList)

    smuaList[5] = true   // berfungsi untuk mengubah nilai di index 5
    println(smuaList)

    smuaList.removeAt(4)  // berfungsi untuk menghapus item di index 4
    println(smuaList)

}