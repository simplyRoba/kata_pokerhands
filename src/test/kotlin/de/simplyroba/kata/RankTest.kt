package de.simplyroba.kata

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test


class RankTest {

    @Test
    fun `should rank high card hand as HIGHCARD`() {
        val hand = Hand()
        assertThat(hand.rank()).isEqualTo(Rank.HIGHCARD)
    }

    @Test
    fun `should rank a hand with a pair as PAIR`() {
        val hand = Hand()
        assertThat(hand.rank()).isEqualTo(Rank.PAIR)
    }
}
