package ders3

fun main() {
    val alisVerisSepeti = mutableListOf<String>()

    alisVerisSepeti.add("Kalem")
    alisVerisSepeti.add("Defter")
    alisVerisSepeti.add("Defter")
    alisVerisSepeti.add("Silgi")

    println("Alışveriş Sepeti: $alisVerisSepeti")

    alisVerisSepeti.add(1, "Çanta")
    println("Alışveriş Sepeti: $alisVerisSepeti")

    alisVerisSepeti.shuffle()
    println("Alışveriş Sepeti: $alisVerisSepeti")

    alisVerisSepeti.remove("Defter")
    println("Alışveriş Sepeti: $alisVerisSepeti")

    alisVerisSepeti.removeAt(2)
    println("Alışveriş Sepeti: $alisVerisSepeti")

    alisVerisSepeti.remove("Çanta")
    println("Alışveriş Sepeti: $alisVerisSepeti")

    alisVerisSepeti.clear()
    println("Alışveriş Sepeti: $alisVerisSepeti")

    val isimler = mutableListOf("Ahmet", "Ayşe")

    isimler[0] = "Mehmet"
    println(isimler)
}