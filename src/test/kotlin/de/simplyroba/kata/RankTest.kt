package de.simplyroba.kata

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test


class RankTest {

    @Test
    fun `should rank high card hand as HIGHCARD`() {
        val hand = Hand(setOf("2H","3D","5S","9C","KD"))
        assertThat(hand.rank()).isEqualTo(Rank.HIGHCARD)
    }

    @Test
    fun `should rank a hand with a pair as PAIR`() {
        val hand = Hand(setOf("2H","2D","5S","9C","KD"))
        assertThat(hand.rank()).isEqualTo(Rank.PAIR)
    }

    @Test
    fun `should rank a hand with two pair as TWOPAIR`() {
        val hand = Hand(setOf("2H","2D","9S","9C","KD"))
        assertThat(hand.rank()).isEqualTo(Rank.TWOPAIR)
    }
}
