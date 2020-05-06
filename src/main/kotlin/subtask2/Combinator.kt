package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var k = 0
        val m = array[0]
        val n = array[1]

        while (k < n) {
            if (fact(k) * fact(n - k) == fact(n) / m) {
                return k
            }
            k++
        }

        return null
    }

    fun fact(num: Int): Long {
        var result: Long = 1
        for (i in 1..num) {
            result = result * i
        }

        return result
    }
}
