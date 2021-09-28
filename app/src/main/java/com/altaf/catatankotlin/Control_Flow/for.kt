package com.altaf.catatankotlin.Control_Flow

// for merupakan konsep perulangan pada blok yang sama tanpa henti
//  -selama kondisi yang telah diberikan masih terpenuhi atau bernilai true.

fun main() { //for loop dengan range expression
    val ranges = 1..7
    for (i in ranges) {
        println("Value is $i")
    }

    for (value in 30 downTo 0 step 5){ //downTo berfungsi untuk menghitung turun. step berfungsi untuk lompat
        println(value)
    }
    for (number in 1..9){
        println(number)
    }
    for (index in(19.downTo(9) step 3)){
        println(index)
    }
    val range = 1.rangeTo(9)
    range.forEachIndexed { index, value -> println("index $index bernilai $value")}

    fun main(){
        println("input rows:")
        var rows = readLine()!!.toInt()

        for (i in rows downTo 1){
            for (j in i downTo 1){
                print("# #")
            }
            println()
        }
    }

}