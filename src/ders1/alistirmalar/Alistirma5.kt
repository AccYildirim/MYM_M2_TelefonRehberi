package ders1.alistirmalar

fun main() {
    println("Sınır sayısı girin: ")
    val sinirSayi = readln().toIntOrNull() ?: 5

    for (i in 1..sinirSayi) {
        val kareDegeri = kareAl(i)
        println("$i sayısının kare değeri: $kareDegeri")
    }
}