package de.simplyroba.kata

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test


class RankTest {

    @Test
    fun `should rank high card hand as HIGH_CARD`() {
        val hand = Hand(setOf("2H","3D","5S","9C","KD"))
        assertThat(hand.rank()).isEqualTo(Rank.HIGH_CARD)
    }

    @Test
    fun `should rank a hand with a pair as PAIR`() {
        val hand = Hand(setOf("2H","2D","5S","9C","KD"))
        assertThat(hand.rank()).isEqualTo(Rank.PAIR)
    }

    @Test
    fun `should rank a hand with two pair as TWO_PAIR`() {
        val hand = Hand(setOf("2H","2D","9S","9C","KD"))
        assertThat(hand.rank()).isEqualTo(Rank.TWO_PAIR)
    }

    @Test
    fun `should rank a hand with three of a kind as THREE_OF_A_KIND`() {
        val hand = Hand(setOf("2H","2D","2S","9C","KD"))
        assertThat(hand.rank()).isEqualTo(Rank.THREE_OF_A_KIND)
    }
}
