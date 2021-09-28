package com.altaf.catatankotlin.Control_Flow
fun main(){
    var tambah = 0
    var i = 1
    while (i <= 20){
        i++
        if (i%2 != 0){
            continue
        }

        tambah += i
        println(tambah)

    }


    loop@ for (i in 1..10) {
            println("Outside Loop")

            for (j in 1..10) {
                println("Inside Loop")
                if ( j > 5) break@loop
            }
        }

} //break yang sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan label.
// break akan menghentikan proses perulangan terluar dari dalam proses perulangan, di mana break tersebut dipanggil.