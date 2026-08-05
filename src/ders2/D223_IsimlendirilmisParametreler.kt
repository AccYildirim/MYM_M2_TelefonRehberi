package ders2

fun main() {
    profilOlustur("AhmetCan Cuma", "Yıldırım", bultenAboneligi = true)
    profilOlustur(
        ad = "Gürkay",
        soyad = "Birinci",
        bultenAboneligi = true,
        yas = 48
    )
    profilOlustur(yas = 48, ad = "Güraky", soyad = "Birinci", bultenAboneligi = false)
}

fun profilOlustur(ad: String, soyad: String, yas: Int = 18, bultenAboneligi: Boolean = false) {
    println("Kullanıcı: $ad $soyad, Yaş: $yas, Bülten: $bultenAboneligi")
}