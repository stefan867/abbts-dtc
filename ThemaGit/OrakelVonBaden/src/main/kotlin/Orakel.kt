import kotlin.random.Random

/**
 * Gibt beim Start einen Sinnspruch, ein Glückssymbol und eine Glückszahl
 * aus.
*
* Autor: Andreas Wassmer
* Version: 20241120
*/

// Überarbeitete Liste der Sprüche
val sprueche = listOf(
    "Nutze den Tag mit einem Lächeln.",
    "Heute ist ein wundervoller Tag für neue Chancen.",
    "Träume groß, arbeite hart, bleib bescheiden.",
    "Die besten Dinge beginnen mit einem mutigen Schritt.",
    "Glaube an dich, der Rest wird folgen."
)

// Überarbeitete Liste der Glückssymbole
val symbole = listOf("☀", "✨", "🍀", "🌈", "🌟", "🔥")

fun main() {
    val random = Random

    // Zufälligen Spruch auswählen
    val spruchIndex = random.nextInt(sprueche.size)
    println("Dein Leitspruch heute: ${sprueche[spruchIndex]}")

    // Zufälliges Symbol auswählen
    val symbolIndex = random.nextInt(symbole.size)
    println("Dein Glückssymbol heute: ${symbole[symbolIndex]}")

    // Zufällige Glückszahl berechnen
    val glueckszahl = random.nextInt(1, 100) // Beispiel: Glückszahl zwischen 1 und 99
    println("Deine Glückszahl heute: $glueckszahl")
}
