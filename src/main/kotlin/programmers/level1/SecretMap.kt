package programmers.level1

class SecretMap {

    fun solution(n: Int, arr1: IntArray, arr2: IntArray): Array<String> {
        val result = mutableListOf<String>()

        for (i in 0 until n) {
            var binaryString = Integer.toBinaryString(arr1[i] or arr2[i])
                .let { it.replace("1", "#") }
                .let { it.replace("0", " ") }

            for (i in binaryString.length until n) {
                binaryString = " $binaryString"
            }

            result.add(binaryString)
        }

        return result.toTypedArray()
    }
}
