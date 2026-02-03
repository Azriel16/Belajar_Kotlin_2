package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Ajil")
    manager.sayHello("azriel")

    val vicePresident = VicePresident("muhamad")
    vicePresident.sayHello("mauladin")
}