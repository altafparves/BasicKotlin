package com.altaf.catatankotlin

// parameter vararg
// jadi vararg adalah parameter yang digunakan untuk data dengan tipedata yang sama

fun main() {
    val angka = sumNumbers( 10, 29, 30, 40 )
    println(angka)

    val arrayNumber = arrayOf( 20,69,30)
    println(sumNumbers2(arrayNumber))

    // spread operator
    // memasukkan array kedalam parameter varargs
    val number1 = intArrayOf(10,20,30)
    val number2 = sumNumbers(10, 20, 30, 40, 50, *number1) // memasukkan number1 dengan cara memberi spread(*)
    println(number2) // fungsi sumNumbers ditaruh di number2 agar outputnya dijumlahkan
}

fun sumNumbers(vararg angka : Int): Int{
    return angka .sum() // .sum digunakan untuk menjumlahkan data hanya bisa dengan tipe data Int
}

// kode tanpa vararg
fun sumNumbers2(number : Array<Int>): Int {
    return number.sum()
}




