package programmers.level2


const val ZERO = '0'
const val ONE = '1'

const val END_BINARY = "1"

/**
 * [이진 변환 반복하기](https://school.programmers.co.kr/learn/courses/30/lessons/70129?language=kotlin)
 * */
class RepeatBinaryTransformation {

    fun solution(s: String): IntArray {
        var tempString = s
        var convertCount = 0
        var removeZeroCount = 0

        while (tempString != END_BINARY) {
            convertCount++
            removeZeroCount += containsCount(tempString, ZERO)
            val oneCount = containsCount(tempString, ONE)
            tempString = convertToBinary(oneCount)
        }

        return intArrayOf(convertCount, removeZeroCount)
    }

    private fun convertToBinary(i: Int) : String{
        var tmpI = i
        val stringBuilder = StringBuilder()
        while (tmpI != 0) {
            stringBuilder.append(tmpI % 2)
            tmpI /= 2
        }
        return stringBuilder.reverse().toString()
    }

    private fun containsCount(s: String, number : Char): Int {
        var result = 0
        val charArray = s.toCharArray()
        for (c in charArray) {
            if (c == number) {
                result++
            }
        }
        return result
    }
}
