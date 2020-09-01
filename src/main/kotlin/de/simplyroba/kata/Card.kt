package de.simplyroba.kata

typealias Card = String

fun Card.rank(): Char {
    return this[0]
}

fun Card.rankAsNumber(): Int {

    return when {

        rank() == '2' -> 2
        rank() == '3' -> 3
        rank() == '4' -> 4
        rank() == '5' -> 5
        rank() == '6' -> 6
        rank() == '7' -> 7
        rank() == '8' -> 8
        rank() == '9' -> 9
        rank() == 'T' -> 10
        rank() == 'J' -> 11
        rank() == 'Q' -> 12
        rank() == 'K' -> 13
        rank() == 'A' -> 14

        else -> 0
    }

}
