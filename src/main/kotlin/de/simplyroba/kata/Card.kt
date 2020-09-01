package de.simplyroba.kata

typealias Card = String

fun Card.rank(): Char {
    return this[0]
}
