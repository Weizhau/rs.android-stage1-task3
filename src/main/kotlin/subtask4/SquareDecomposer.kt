package subtask4

class SquareDecomposer {
    val output = ArrayList<Int>()
    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        var temp = number
        temp--
        var sum = 0
        while ((sum + temp * temp != number * number) && temp > 0) {
            if (sum + temp * temp < number * number) {
                sum = sum + temp * temp
                output.add(temp)
            }
            temp--
        }
        output.reverse()
        return output.toTypedArray()
    }
}
