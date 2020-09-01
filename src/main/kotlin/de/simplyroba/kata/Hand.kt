package de.simplyroba.kata

class Hand(
    private val cards: Set<Card>
) {
    fun rank(): Rank {
        return when {
            occurrenceOfPairs() == 1 -> Rank.PAIR
            occurrenceOfPairs() == 2 -> Rank.TWO_PAIR
            else -> Rank.HIGH_CARD
        }
    }

    private fun occurrenceOfPairs(): Int {
        return cards
            .map { card -> card.rank() }
            .groupingBy { rank -> rank }
            .eachCount()
            .filterValues { rank -> rank == 2 }
            .size
    }
}
