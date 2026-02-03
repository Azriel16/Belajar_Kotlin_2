package app

import data.Person

fun main() {
    val ajil = Person()
    ajil.firstName = " AJil"

    ajil.sayHello("Ajil")
    ajil.sayHello("Azriel", "Mauladin")
}