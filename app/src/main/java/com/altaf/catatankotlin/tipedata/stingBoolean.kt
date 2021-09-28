
fun main(){
    println(boolean())
    print(string())
}

fun boolean() : Boolean{
    println("==================  Boolean  =========")
    var benar : Boolean = true
    var salah : Boolean = false

    return(salah)

}

fun string() {
    println("===========STRING===============")

    println("#print turun===========")
    var alamat = """
        Tamansari Bukit Mutiara
        Wika KH/12/05
        Kelurahan Gunung Samarinda
    """ // jika ingin ngeprint kebawah maka gunakan 3 tanda petik ("""). tapi output akan sedikit ke kanan
    println(alamat)

    println("#trimIndent==========")
    alamat = """
        Tamansari Bukit Mutiara
        Wika KH/12/05
        Kelurahan Gunung Samarinda
    """.trimIndent() // trimIndent berfungsi agar output mepet ke kiri
    println(alamat)

    println("trimMargin===========")
    alamat = """
        |Tamansari Bukit Mutiara
        Wika KH/12/05
        |Kelurahan Gunung Samarinda
    """.trimMargin() // trimMargin berfungsi untuk mwmojokkan ke kiri output tapi hanya yang kita pilih dengan (|)
    println(alamat)


    //Menggabungkan string
    println("=============MENGGABUNGKAN STRING=====================")
    val fName = "Athar"
    val lName = "Ilham"
    println(fName + " " + lName)

    // STRING TEMPLATE
    println("=====================STRING TEMPLATE======================")
    val hewan = "Kucing"
    val full = "${hewan.length}" // .length berfungsi untuk menghitung ada berapa huruf dalam variabel kita
    println("banyak huruf di kata $hewan = $full huruf")

}