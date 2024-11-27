import java.util.Scanner

/**
 * Das bekannte Spiel Schere-Stein-Papier zwischen einem
 * Spieler und dem Computer.
 *
 * Autor: Andreas Wassmer
 * Version: 20241115
 */

fun main() {
    val scanner = Scanner(System.`in`)
    val options = listOf("s", "t", "p")
    println("Willkommen zu Schere-Stein-Papier")
    print("Wie heissen Sie? ")
    val username = scanner.nextLine()

    while (true) {
        println("$username, wählen Sie: (S)chere, S(T)ein oder (P)apier (oder tippe '(B)eenden', um das Spiel zu verlassen")
        val userChoice = scanner.nextLine().lowercase()

        if (userChoice == "b") {
            println("Das Spiel ist beendet.")
            break
        }

        if (userChoice !in options) {
            println("Ungültige Eingabe. Bitte wählen Sie nochmals.")
            continue
        }

        val computerChoice = options.random()
        when {
            computerChoice == "s" -> println("Computer hat Schere gewählt")
            computerChoice == "t" -> println("Computer hat Stein gewählt")
            computerChoice == "p" -> println("Computer hat Papier gewählt")
        }

        when {
            userChoice == computerChoice -> println("Unentschieden")
            userChoice == "s" && computerChoice == "p" ||
                    userChoice == "t" && computerChoice == "s" ||
                    userChoice == "p" && computerChoice == "t" -> println("Sie gewinnen!")
            else -> println("Der Computer gewinnt")
        }
        println()
    }
}
