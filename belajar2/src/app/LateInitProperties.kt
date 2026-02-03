package app

import data.Television

fun main() {
    val tv = Television()
//    println(tv.brand) ERROR
//    tv.brand = "Sasmsung" Set value namun di bagian class/ data harus d hapus inisialisasinya
    tv.initTelevision("Samsung")
    println(tv.brand)
}