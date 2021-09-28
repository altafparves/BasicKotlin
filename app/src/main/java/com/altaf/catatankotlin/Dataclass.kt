package com.altaf.catatankotlin

class Animal(val name : String, val age :Int){
    override fun toString(): String {
         return "DataAnimal(name= $name, age = $age)"
    }
}
//data class hanya dapat menampung data, tidak bisa ditambah dengan logika(for, if dll)
data class DataAnimal(val name: String, val age: Int)

fun main() {
    val animal = Animal ("Tiger", 4)
    val dataAnimal= DataAnimal("Elephant",5)

//   equal()
    // equal berfungsi untuk mengecek apakah kedua data sama (output= true,false
    val dataAnimal2 = DataAnimal("Elephant", 5)
    val dataAnimal3 = DataAnimal("pig", 90)

//  copy()
    // copy berfungsi untuk jika ingin menyalin data yang isinya sama persis dengan variabel lain dengan variabel baru
    val dataAnimal4 = dataAnimal3.copy()
    val dataAnimal5 = dataAnimal2.copy(age = 200) //.copy jg berfungsi untuk mengubah data

    println(animal)
    println(dataAnimal)

    println(dataAnimal.equals(dataAnimal2))
    println(dataAnimal.equals(dataAnimal3))

    println(dataAnimal4)
    println(dataAnimal5)

    //componentN berfungsi untuk mengakses salah satu argumen  dari sebuah data, (gak jauh beda dari index di array )
    val nama = dataAnimal3.component1()
    println("$nama adalah component 1 dari variabel dataAnimal3 ")
}
