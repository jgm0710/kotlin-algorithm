package programmers.level1

/**
 * [로또의 최고 순위와 최저 순위](https://school.programmers.co.kr/learn/courses/30/lessons/77484?language=kotlin)
 * */
class HighestAndLowestRanksOfTheLotteryHelp {

    /**
     * 문제 포인트
     *
     * 실제 당첨 개수를 구한다.
     *
     * 알 수 없는 번호의 개수를 구한다.
     *
     * 실제 당첨 개수 번호 + 알 수 없는 번호 개수 -> 가능한 최고 당첨 개수
     * 실제 당첨 개수 번호 -> 가능한 최저 당첨 개수
     *
     * 당첨 개수별 순위를 구한다.
     *
     * 최고 당첨 개수 -> 순위
     * 최저 당첨 개수 -> 순위
     * */
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val equalsCount = getEqualsCount(lottos, win_nums)
        val zeroCount = getZeroCount(lottos)

        val maxRanking = calculateRanking(equalsCount + zeroCount)
        val minRanking = calculateRanking(equalsCount)

        return intArrayOf(maxRanking, minRanking)
    }

    private fun calculateRanking(winCount: Int): Int {
        return when (winCount) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }

    private fun getZeroCount(lottos: IntArray): Int {
        var zeroCount = 0
        for (lotto in lottos) {
            if (lotto == 0) zeroCount++
        }
        return zeroCount
    }

    private fun getEqualsCount(lottos: IntArray, winNums: IntArray): Int {
        var eqCount = 0
        for (lotto in lottos) {
            if (winNums.contains(lotto)) eqCount++
        }
        return eqCount
    }
}
