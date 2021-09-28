package com.altaf.catatankotlin
fun main() {
//    membuat null dan melakukan pengecekan dengan if dan else
    // Cara panjang
    println("============ngecek dengan if============")
    val angka = null

    if (angka != null) {
        println("variabel angka bukan null")

    } else {
        println("variabel angka adalah null")
    }

// CARA PENDEK    dari if
    var nama : String? = null
    if (nama != null)println("nama bukan null") else println("nama adalah null")
//    Jika menggunakan versi pendek maka kita tidak perlu menggunakan kurung kurawal

    //Elvis operator
    nama = "bukan null"
    val elvis = nama?.length  ?: "nama adalah null"
// kode diatas artinya jika nama bukan null maka akan ngeprint "nama bukan null.
// tapi jika nama adalah null maka akan ngeprint "nama adalah null"
    println (elvis)


//     Safe Calls
    println("==========Safe Calls============")
    var safecalls : String? = null
//     di variabel kita beri tanda tanya di tipe data
    println(safecalls?.length)
//     selain di tipe data kita juga harus memberikan tanda tanya di variabel

    // !!operator
    val s : String? = "onta"
    println(s!!)//error karena datanya beneran null


}
