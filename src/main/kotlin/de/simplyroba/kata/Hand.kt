package de.simplyroba.kata

class Hand(
    private val cards: Set<Card>
) {
    fun rank(): Rank {
        return when {
            occurrenceOf(TypeOfOccurrence.PAIR) == 1 -> Rank.PAIR
            occurrenceOf(TypeOfOccurrence.PAIR) == 2 -> Rank.TWO_PAIR
            occurrenceOf(TypeOfOccurrence.THREE_OF_A_KIND) == 1 -> Rank.THREE_OF_A_KIND
            else -> Rank.HIGH_CARD
        }
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
