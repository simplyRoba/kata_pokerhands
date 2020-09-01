package de.simplyroba.kata

class Hand (
    private val cards: Set<String>
) {
    fun rank(): Rank {

        val eachCount = cards.map { card -> card[0] }
            .groupingBy { rank -> rank }.eachCount().filterValues { rank -> rank == 2 }

        if(eachCount.count() > 0)
        {
            return Rank.PAIR
        }

        return Rank.HIGHCARD
    }
}
