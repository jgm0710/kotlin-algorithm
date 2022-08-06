package programmers.level1

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class HighestAndLowestRanksOfTheLotteryHelpTest {

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    fun solution(lottos: IntArray, win_nums: IntArray, result: IntArray) {
        val solutionResult = HighestAndLowestRanksOfTheLotteryHelp().solution(lottos, win_nums)
        assertArrayEquals(result, solutionResult)
    }

    companion object {
        @JvmStatic
        private fun provideStringsForIsBlank(): Stream<Arguments>
        {
            return Stream.of(
                Arguments.of(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19), intArrayOf(3, 5)),
                Arguments.of(intArrayOf(0, 0, 0, 0, 0, 0), intArrayOf(38, 19, 20, 40, 15, 25), intArrayOf(1, 6)),
                Arguments.of(intArrayOf(45, 4, 35, 20, 3, 9), intArrayOf(20, 9, 3, 45, 4, 35), intArrayOf(1, 1))
            )
        }
    }
}
