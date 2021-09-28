package com.altaf.catatankotlin

fun main() {
    // waktuBuka
    println(waktuBuka())
    println(nilai())
}

// dengan menggunakan greater than
fun waktuBuka() {
    val jamBuka = 7
    val waktuSkarang = 7
    val kantor: String

    kantor = if (waktuSkarang > jamBuka) { // disini di if kita tidak memerlukan print dikarenakan dipersingkat, dan masuk kedalam variaberl kantor
        "kantor Sudah buka"

    } else if (waktuSkarang == jamBuka) {
        "tunggu sebentar, kantor akan buka"

    } else {
        "Kantor masih tutup"
    }

    println(kantor)
}

fun nilai(){
    println("===========Nilai Ujian===========")

    val nilaiUjian  = 90

    if (nilaiUjian == 90-100 ){
        println("nilai anda A")
    } else if(nilaiUjian < 80){
        println("nilai anda B")

    } else if(nilaiUjian < 70){
        println("nilai anda C")

    }else {
        println(" gatau apa")
    }

}

