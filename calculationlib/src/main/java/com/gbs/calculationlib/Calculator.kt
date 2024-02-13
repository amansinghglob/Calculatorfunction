package com.gbs.calculationlib

object Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        require(b != 0.0) { "Division by zero" }
        return a / b
    }
}