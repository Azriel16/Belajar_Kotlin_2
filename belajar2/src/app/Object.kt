package app

import data.Person

fun main() {
    val ajil = Person()
    ajil.firstName = "Ajil"
    val azriel = Person()
    azriel.firstName = "Azriel"
    val muhamad = Person()
    muhamad.firstName = "Mauladin"

    println(ajil.firstName)
    println(azriel.firstName)
    println(muhamad.firstName)

}