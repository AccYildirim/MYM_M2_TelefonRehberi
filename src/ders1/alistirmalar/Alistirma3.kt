package ders1.alistirmalar

fun main() {

    println("Kısa kenar uzunluğunu giriniz: ")
    val kisaKenar = readln().toDoubleOrNull() ?: 1.0

    println("Uzun kenar uzunluğunu giriniz: ")
    val uzunKenar = readln().toDoubleOrNull() ?: 1.0

    println(dikdortgenAlanHesapla(kisaKenar, uzunKenar))
}