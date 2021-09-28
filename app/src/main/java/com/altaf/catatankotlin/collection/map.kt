package com.altaf.catatankotlin.collection

fun main() {

    val capital = mapOf(
        "Beijing" to "China",
        "New York" to "America",
        "Moskow" to "Russia"

    )
    val mapKeys = capital.keys // berfungsi untuk memanggil smua keys (beijing,nY, moskow)
    val mapValues = capital.values // berfungsi untuk memanggil smua value

    println(capital["Beijing"])
    println(capital.getValue("Moskow"))

    println(mapKeys)
    println(mapValues)

    //Mutable map
    println("=========mutable map========")

    //Mutable map berfungsi untuk menambah data di map dengan cara buat variabel baru seperti dibawah
    val ibuKota = capital.toMutableMap()
    ibuKota.put("Amsterdam", "Netherlands")
    ibuKota.put("Dublin" , "Ireland")

    println(ibuKota)

}