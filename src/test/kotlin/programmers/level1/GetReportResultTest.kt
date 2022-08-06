package programmers.level1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GetReportResultTest {

    @Test
    fun solution() {
        val idList1 = arrayOf("muzi", "frodo", "apeach", "neo")
        val idList2 = arrayOf("con", "ryan")

        val report1 = arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi")
        val report2 = arrayOf("ryan con", "ryan con", "ryan con", "ryan con")

        val k1 =2
        var k2 =3

        val result1 = arrayOf(2,1,1,0)
        val result2 = arrayOf(0, 0)

        val solutionResult1 = GetReportResult().solution(idList1, report1, k1)
        val solutionResult2 = GetReportResult().solution(idList2, report2, k2)

        for (i in result1.indices) {
            assertEquals(result1[i], solutionResult1[i])
        }

        for (i in result2.indices) {
            assertEquals(result2[i], solutionResult2[i])
        }
    }

}
