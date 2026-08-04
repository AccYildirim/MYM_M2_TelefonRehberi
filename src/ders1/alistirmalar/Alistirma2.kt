package ders1.alistirmalar

fun main() {
    println("Adınızı giriniz: ")
    val ad = readln().trim()

    val oyuncuAdi = if (ad.isEmpty()) "Misafir Oyuncu" else ad

    print("Skorunuzu giriniz: ")
    val skor = readln().toIntOrNull() ?: 0

    skorTablosuYazdir(oyuncuAdi, skor)
}