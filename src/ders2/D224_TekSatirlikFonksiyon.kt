package ders2

fun main() {
    var sayininKaresi = kareHesapla(5)
    println("Sayının Karesi: $sayininKaresi")

    sayininKaresi = kareHesaplaKisa(7)
    println("Sayının Karesi: $sayininKaresi")
}

fun kareHesapla(sayi: Int): Int {
    return sayi * sayi
}

fun kareHesaplaKisa(sayi: Int) = sayi * sayi