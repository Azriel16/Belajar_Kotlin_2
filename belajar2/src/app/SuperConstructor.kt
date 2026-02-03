package app

import data.ExecutiveCustomer
import data.PremiumCostumer

fun main() {
    val premiumCostumer = PremiumCostumer("Ajil")
    println(premiumCostumer.name)

    val executiveCustomer = ExecutiveCustomer("Azriel", 1000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}