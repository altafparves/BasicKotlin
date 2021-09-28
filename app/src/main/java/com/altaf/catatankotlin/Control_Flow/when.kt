package com.altaf.catatankotlin.Control_Flow

fun main() {
    val nilai = 8
// when ga jauh beda sama if
    when(nilai){
        6 -> println("Nilai = 6")
        7 -> println("Nilai = 7")
        8 -> println("Nilai = 8")
        9 -> println("Nilai = 9")
        else -> println("Nilai tak diketahui ")
    }

    // cara singkatnuya dengan string:
    println("=======Cara singkat dengan string=========")
    val value = 10
    val stringOfValue = when(value){
        10 -> "Nilai = 10"
        11 -> "Nilai = 11"
        12 -> "Nilai = 12"
        else -> "Nilai tak diketahui"
    }
    println(stringOfValue )

//When Expression Multiple Option
    println("==========When multiple Option===========")
    // jadi di sini bisa multiple option satu jawaban
    val namaHewan= "babi"
    val stringHewan = when(namaHewan){
        "babi","singa","Harimau"-> println("adalah nama hewan")
        else -> println("Bukan nama hewan")
    }
    println(stringHewan)

// when expression in
    println("==========When expression in=========")

    val Value = 28
    val ranges = 5..30 // .. artinya sampai (5..30 = 5 sampai 30)
// Karena range nya 5 - 30 maka value yang bernilai 28 masih masuk
    when (Value){
        in ranges -> println("Value is in the range")
        !in ranges -> println("Value is not in the range") // tidak dalam range
        else -> println("Nilai tak diketahui")
    }

// when tanda variabel
    println("========When tanda variabel==============")

    val nilaiUjian = 0
    when {
        nilaiUjian > 90 -> println("Anda pelajar terbaik")
        nilaiUjian > 80 -> println("Anda pelajar terbaik")
        else -> println("Anda bodoh blajar lagi")
    }

}
