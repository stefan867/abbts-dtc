import kotlin.random.Random

fun main() {

    val die = Random

    val playerScore = die.nextInt(7)
    val computerScore = die.nextInt(7)

    // todo: Den Fehler im Programm finden und beheben
    // todo: Den Spieler nach dem Namen fragen
    // todo: Solange spielen bis Spieler abbricht
    // todo: Ausgeben, wer mehr Runden gewonnen hat

    println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
    when {
        playerScore > computerScore -> println("Du gewinnst")
        playerScore < computerScore -> println("Der Computer gewinnt")
        else -> println("Unentschieden")
    }
}