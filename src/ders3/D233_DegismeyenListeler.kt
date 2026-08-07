package ders3

fun main() {
    val zorlukSeviyeleri = listOf("Kolay", "Orta", "Zor")
    println(zorlukSeviyeleri[0].uppercase())
    println(zorlukSeviyeleri)

    // zorlukSeviyeleri.add("Efsanevi") HATA: Ekleme Yapılamaz.

    // zorlukSeviyeleri[2] = "Efsanevi" HATA: Değer Değiştirilemez.
    println(zorlukSeviyeleri.size)
    println(zorlukSeviyeleri.isEmpty())
}