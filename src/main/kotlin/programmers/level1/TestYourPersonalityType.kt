package programmers.level1

class TestYourPersonalityType {

    val results: MutableMap<String, Int> = mutableMapOf()

    /**
     * - survey 에서 앞에 오는 대상에 대해서 점수를 얻기 위해서는 choices 값이 1~3,
     *   뒤에 오는 대상에 대해서 점수를 얻기 위해서는 choices 값이 5~7
     *   4의 경우 어느쪽도 점수를 얻을 수 없음
     *
     * - survey, choices 를 돌면서 점수를 모두 합산하여 성격 유형 검사를 추출
     *
     * - 같은 유형에서 점수가 같을 경우 단어 순서가 빠른 유형이 해당 사람의 유형으로 결정
     * */
    fun solution(survey: Array<String>, choices: IntArray): String {

        val n = survey.size

        for (i in 0 until n) {
            val surveyOne = survey[i]
            val choiceOne = choices[i]

            val first = surveyOne.substring(0, 1)
            val second = surveyOne.substring(1)

            when (choiceOne) {
                1 -> addPointToSurvey(first, 3)
                2 -> addPointToSurvey(first, 2)
                3 -> addPointToSurvey(first, 1)
                5 -> addPointToSurvey(second, 1)
                6 -> addPointToSurvey(second, 2)
                7 -> addPointToSurvey(second, 3)
                else -> continue
            }
        }

        val survey1 = selectSurvey("R", "T")
        val survey2 = selectSurvey("C", "F")
        val survey3 = selectSurvey("J", "M")
        val survey4 = selectSurvey("A", "N")

        return  "${survey1}${survey2}${survey3}${survey4}"
    }

    private fun selectSurvey(s: String, s1: String): String {
        val sValue = results[s] ?: 0
        val s1Value = results[s1] ?: 0

        if (sValue > s1Value) {
            return s
        }

        if (sValue < s1Value) {
            return  s1
        }

        return if (s < s1) {
            s
        } else {
            s1
        }
    }

    private fun addPointToSurvey(first: String, plusPoint: Int) {
        val i1 = results[first]
        if (i1 == null) {
            results[first] = plusPoint
        } else {
            results[first] = i1 + plusPoint
        }
    }
}
