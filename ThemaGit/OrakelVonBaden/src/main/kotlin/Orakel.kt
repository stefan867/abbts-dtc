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
    val random1 = Random
    val index1 = random1.nextInt(spells.size)
    println("Dein Leitspruch heute: ${spells[index1]}")

    // Todo: Hier das Glückssymbol ausgeben
    val random2 = Random
    val index2 = random2.nextInt(symbole.size)
    println("Dein Glückssymbol heute: ${symbole[index2]}")

    // Todo: Hier die Glückszahl berechnen und ausgeben
}