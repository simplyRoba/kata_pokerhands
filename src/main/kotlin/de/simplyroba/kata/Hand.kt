package de.simplyroba.kata

class Hand(
    private val cards: Set<Card>
) {
    fun rank(): Rank {
        return when {
            isStraight() -> Rank.STRAIGHT
            occurrenceOf(TypeOfOccurrence.THREE_OF_A_KIND) == 1 -> Rank.THREE_OF_A_KIND
            occurrenceOf(TypeOfOccurrence.PAIR) == 2 -> Rank.TWO_PAIR
            occurrenceOf(TypeOfOccurrence.PAIR) == 1 -> Rank.PAIR
            else -> Rank.HIGH_CARD
        }
    }

    private fun isStraight(): Boolean {
        val sorted = cards
            .map { card -> card.rankAsNumber() }
            .sorted()

        for (x in 0..3) {
            val current = sorted[x]
            val next = sorted[x + 1]
            if (current + 1 != next) return false
        }
        return true
    }

    private fun occurrenceOf(typeOfOccurrence: TypeOfOccurrence): Int {
        return cards
            .map { card -> card.rank() }
            .groupingBy { rank -> rank }
            .eachCount()
            .filterValues { rank -> rank == typeOfOccurrence.numberOfCards }
            .size
    }
}
