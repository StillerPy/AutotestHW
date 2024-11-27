package ru.netology

import calculateCommission

fun main() {
    val card = "MasterCard"
    val previousSum = 0
    val transaction = 150_000
    val result = calculateCommission(card, previousSum, transaction)
    println(result)
}