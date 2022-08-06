package programmers.level1

class GetReportResult {

    private val reportResult = mutableMapOf<String, MutableSet<String>>()
    private val mailSentResult = mutableMapOf<String, Int>()

    /**
     * 한 회원은 서로 다른 유저를 한 번 씩 신고할 수 있다.
     *
     * k 번 이상 신고된 회원은 정지가 된다.
     *
     * 정지된 회원을 신고한 회원에게는 메일이 간다.
     *
     * report -> 신고한 회원 ID <공백> 신고 당한 회원 ID
     *
     * =================================
     *
     * 같은 유저를 두 번 신고할 경우 무시
     *
     * 신고 당한 회원의 이름으로 맵을 만든다.
     * ID, List<ID> 맵
     * key.size 가 k 보다 큰 맵을 찾는다.
     *
     * 메일을 보낼 횟수에 대한 배열 방을 만든다.
     * */
    fun solution(id_list: Array<String>, report_list: Array<String>, k: Int): IntArray {

        for (r in report_list) {
            val report = parseReport(r)

            reportResult[report.reportedUserId]?.add(report.reportUserId)
                ?: run { reportResult[report.reportedUserId] = mutableSetOf(report.reportUserId) }
        }

        for (reportedUserid in id_list) {
            val reportedResultReportUsers = reportResult[reportedUserid] ?: continue

            if (reportedResultReportUsers.size >= k) {
                for (reportUserId in reportedResultReportUsers) {
                    val i = mailSentResult[reportUserId]
                    if (i == null) {
                        mailSentResult[reportUserId] = 1
                    } else {
                        mailSentResult[reportUserId] = i + 1
                    }
                }
            }
        }

        val mutableListOf = mutableListOf<Int>()
        for (i in id_list.indices) {
            val mailSentResult = mailSentResult[id_list[i]] ?: 0
            mutableListOf.add(i, mailSentResult)
        }
        return mutableListOf.toIntArray()
    }

    private fun parseReport(r: String): Report {
        val indexOf = r.indexOf(' ')
        return Report(r.substring(0, indexOf), r.substring(indexOf + 1))
    }

    data class Report(
        val reportUserId: String,
        val reportedUserId: String,
    )
}
