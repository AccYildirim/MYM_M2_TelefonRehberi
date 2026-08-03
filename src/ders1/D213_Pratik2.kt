package ders1

fun main() {
    urunFiyatiGoster("Kalem", 61.65)
    cizgiCek()
    urunFiyatiGoster("Defter", 85.61)
    cizgiCek()
    urunFiyatiGoster("Silgi", 36.10)
    cizgiCek()
}

fun urunFiyatiGoster(urunAdi: String, fiyat: Double) {
    println("Seçtiğiniz ürün: $urunAdi, Fiyat: $fiyat TL")

}
