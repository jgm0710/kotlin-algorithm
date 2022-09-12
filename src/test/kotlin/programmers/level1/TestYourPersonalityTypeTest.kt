package programmers.level1

import org.junit.jupiter.api.Test

internal class TestYourPersonalityTypeTest {

    @Test
    fun sam() {
        val survey = arrayOf("AN", "CF", "MJ", "RT", "NA")
        val choices = intArrayOf(5, 3, 2, 7, 5)

        val result = TestYourPersonalityType().solution(survey, choices)

        println("result = ${result}")

        val s2 = arrayOf("TR", "RT", "TR")
        val c2 = intArrayOf(7, 1, 3)
        val result2 = TestYourPersonalityType().solution(s2, c2)

        println("result = ${result2}")
    }
}
