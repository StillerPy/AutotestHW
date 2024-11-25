package ru.netology

import calculateCommission

fun main() {
    val card = "Visa"
    val previousSum = 0
    val transaction = 1000
    val result = calculateCommission(card, previousSum, transaction)
    println(result)
}