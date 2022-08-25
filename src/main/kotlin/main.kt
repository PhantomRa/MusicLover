package ru.netology

import kotlin.math.roundToInt

fun main() {
    val flatDiscount = 100
    val percentageDiscount = 5.0

    println("Введите сумму покупки:")
    val totalPrice = readLine()?.toInt()
    println("Вы постоянный покупатель? (Да/Нет)")
    val musicLover: Boolean = readLine() == "Да"

    var result = 0.0
    if (totalPrice != null) {
        if (totalPrice > 10000) {
            result = totalPrice - totalPrice * percentageDiscount / 100
        } else if (totalPrice in 1001..10000) {
            result = (totalPrice - flatDiscount).toDouble()
        } else if (totalPrice in 1..1000)
            result = totalPrice.toDouble()
        else
            println("Сумма покупки введена неверно или ничего не куплено!")
    }
    if (musicLover) result -= result * 0.01

    println("Сумма покупки с учетом скидок равна ${result.toInt()} руб. ${(result % 1 * 100).roundToInt()} коп.")
}