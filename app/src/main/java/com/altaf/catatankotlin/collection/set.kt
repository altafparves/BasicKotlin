package com.altaf.catatankotlin.collection

fun main() {
    val integerSet = setOf(9,5,2,7,6,1,3,4,5) // outpunya hanya akan menampilkan setiap angka hanya satu walau ada yg dobble
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB) // output dari perbandingan ini akan true karena angka nya sama smua walau ada yg dobble dan angka tidak sama urutannnya

    val nama = setOf("babi", "anjing", "anjing")
    println(nama)

    //union and intersect
    println("=========Union and Intersect============")

    val himpunanA = setOf(1, 4, 2, 1, 5)
    val himpunanB = setOf(1, 5, 7)
    val gabungan = himpunanA.union(himpunanB) // union berfungsi untuk menampilkan gabungan data  dari 2 variabe
    val irisan = himpunanA.intersect(himpunanB) // intersect berfungsi untuk menampilkan irisan data dari 2 variabel

    println(gabungan)
    println(irisan)

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)

    mutableSet.add(6) // berfungsi menambag data
    println(mutableSet)

    mutableSet.remove(5 ) //berfungsi menghapus elemen atau angka 1
    println(mutableSet)

}