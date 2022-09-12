package programmers.level2

import org.junit.jupiter.api.Test

internal class RepeatBinaryTransformationTest {

    @Test
    fun sam() {
        val repeatBinaryTransformation = RepeatBinaryTransformation()
        val solution = repeatBinaryTransformation.solution("1111111")

        for (i in solution) {
            println("i = ${i}")
        }

    }
}
