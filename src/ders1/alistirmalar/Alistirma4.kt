package ders1.alistirmalar

fun main() {
    print("Bir sayı girin: ")
    val sayi = readln().toIntOrNull() ?: 0

    val sonuc = ciftMi(sayi)

    if (sonuc) {
        println("Girilen $sayi sayısı çift")
    } else {
        println("Girilen $sayi sayısı tek")
    }
}