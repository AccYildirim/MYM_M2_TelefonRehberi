package ders1.alistirmalar

fun sistemBilgisiGoster(gelistiriciAdi: String) {
    println("---Uygulama Bilgileri---")
    println("LEADER BANK MOBİLE")
    println("Geliştirici: $gelistiriciAdi")
}

fun skorTablosuYazdir(isim: String, skor: Int) {
    println("---------------------------------------------")
    println("             OYUNCU KARTI                    ")
    println("         Kullanıcı Adı: $isim                ")
    println("         Toplam Puanı: $skor                 ")
    println("---------------------------------------------")
}

fun dikdortgenAlanHesapla(kenar1: Double, kenar2: Double): Double {
    return kenar1 * kenar2
}

fun ciftMi(sayi: Int): Boolean {
    return sayi % 2 == 0
}

fun kareAl(sayi: Int): Int {
    return sayi * sayi
}