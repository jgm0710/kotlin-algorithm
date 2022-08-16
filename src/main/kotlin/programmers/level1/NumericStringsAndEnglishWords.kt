package programmers.level1

/**
 * [숫자 문자열과 영단어](https://school.programmers.co.kr/learn/courses/30/lessons/81301)
 *
 * ---
 *
 * - 숫자의 자리수를 영어 단어로 바꾸어 주면, 그 영단어를 다시 숫자로 변환하여 결과값을 출력하는 문제
 *
 * */
class NumericStringsAndEnglishWords {

    fun solution(s: String): Int {
        var tmpS = s
        tmpS= tmpS.replace("zero", "0")
        tmpS= tmpS.replace("one", "1")
        tmpS= tmpS.replace("two", "2")
        tmpS= tmpS.replace("three", "3")
        tmpS= tmpS.replace("four", "4")
        tmpS= tmpS.replace("five", "5")
        tmpS= tmpS.replace("six", "6")
        tmpS= tmpS.replace("seven", "7")
        tmpS= tmpS.replace("eight", "8")
        tmpS= tmpS.replace("nine", "9")

        return tmpS.toInt()
    }


}
