package ders2

import ders1.cizgiCek

fun main() {
    kahveSiparisiAl("Türk Kahvesi", "Şekerli")
    cizgiCek()
    kahveSiparisiAl("Filtre Kahve")
}

fun kahveSiparisiAl(kahveTuru: String, sekerMiktari: String = "Orta", sutluMu: Boolean = false) {
    println("Sipariş: $kahveTuru, Şeker Miktarı: $sekerMiktari, Sütlü mü: $sutluMu")
}