package app

import data.User

fun main() {

    val user1 = User("ajil", "Bold123")
    val user2 = User("azriel", "Bold321")

    user1.username = "muhamad"
    user1.password = "mauladin"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}