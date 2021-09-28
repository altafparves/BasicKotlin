package com.altaf.catatankotlin.Control_Flow

fun main() {
    var counter = 1
    while(counter <= 3){ // counter bernilai 1, selama counter lebih kecil dari 3 maka akan ngeprint terus
        println("Hello word")
        counter ++ // di karenakan ditambah(increment) ++ maka nilai caounter nambah trus. apabila counter udh lebih dari 3 maka aka berhenti ngeprint
    }
    // do while
    println("==========Do while===========") // jadi do while berfungsi untuk agar 'do' nya di print dulu walau kondisi false
    var takbir = 1  // pada Do While Loop, kode blok akan dijalankan dahulu, baru diakhir dilakukan pengecekan kondisi
    do{
        println("Allahu akbar") // perintah ditaruh dulu diatas
        takbir ++

    } while (takbir <= 7) // kemudian kondisi dibawah
}