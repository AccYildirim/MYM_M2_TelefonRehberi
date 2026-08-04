package ders1.alistirmalar

fun main() {
    println("Lütfen adınızı giriniz: ")
    val girilenIsim = readln().trim()

    val isim = if (girilenIsim.isEmpty()) "Anonim geliştirici" else girilenIsim

    sistemBilgisiGoster(isim)
}