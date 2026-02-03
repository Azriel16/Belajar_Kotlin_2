package app

import data.Person

fun main() {
    val ajil = Person()

    ajil.firstName = "Ajil"
    ajil.middleName = "Muhamad"
    ajil.lastName = "Mauladin"

    ajil.sayHello("Ajil")
    ajil.run()

    val fullName = ajil.getFullName()
    println(fullName)
}