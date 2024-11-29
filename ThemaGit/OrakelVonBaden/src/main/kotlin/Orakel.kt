import kotlin.random.Random

/**
 * Gibt beim Start einen Sinnspruch , ein Glückssymbol und eine Glückszahl
 * aus.
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */

// Die Sprüche des Tages
val spells = listOf("Nutze den Tag.", "Heute ist ein toller Tag.")

// Todo: Hier die Liste mit den Glückssymbolen einfügen
val symbole = listOf("!","@","*","#","+")

fun main() {
    val random = Random
    val index = random.nextInt(spells.size)
    println("Dein Leitspruch heute: ${spells[index]}")

    // Todo: Hier das Glückssymbol ausgeben

    // Todo: Hier die Glückszahl berechnen und ausgeben
}