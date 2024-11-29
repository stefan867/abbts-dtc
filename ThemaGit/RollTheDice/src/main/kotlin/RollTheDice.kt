import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */

fun main() {

    // Todo: Den Spieler nach dem Namen fragen
    print("Gib deinen Namen ein: ")
    var player1 = readln()
    var player2 = "computer"
    var punktePlayer1 = 0
    var punktePlayer2 = 0

    // Todo: Solange spielen bis Spieler abbricht
    do {
        val die = Random
        val player1Score = die.nextInt(1..6)
        val player2Score = die.nextInt(1..6)
        println("$player1 würfelt: $player1Score  --  $player2 würfelt: $player2Score")
        when {
            player1Score > player2Score -> {
                println("$player1 gewinnt")
                punktePlayer1 ++
            }
            player1Score < player2Score -> {
                println("$player2 gewinnt")
                punktePlayer2 ++
            }
            else -> println("Unentschieden")
        }
        print("Wollen Sie das Spiel beenden? j/n ")
        var abbruch = readln()
    } while (abbruch != "j")

    // Todo: Ausgeben, wer mehr Runden gewonnen hat
    println("Spielstand: $player1 $punktePlayer1 : $player2 $punktePlayer2")
}