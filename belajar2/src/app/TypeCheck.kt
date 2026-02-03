package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any){
    if (any is Laptop){
        println("Laptop With name ${any.name}")
    } else if (any is HandPhone){
        println("Handphone With name ${any.name}")
    } else {
    println(any)
    }
}

fun printObjectWithWhen(any: Any){
    when (any) {
        is Laptop -> println("Laptop With name ${any.name}")
        is HandPhone -> println("Handphone With name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {
    printString("Muhamad")
//    printString(1) ERROR

    printStringSafe("Mauladin")
    printStringSafe(1) //null

    printObjectWithWhen("Ajil")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Asus"))
    printObjectWithWhen(HandPhone("Samsung"))
}