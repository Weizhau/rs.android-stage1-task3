package subtask3

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var validNumbers = ArrayList<Int>();
        var result: Int = 0

        itemsFromArray.filterIsInstanceTo(validNumbers, Int::class.javaObjectType)

        if (numberOfItems < validNumbers.size) {
            if (validNumbers.size > 0) {



                result = 1

                for (num in validNumbers) {
                    result *= num
                }
            }

        } else {
            if (validNumbers.size > 0) {
                result = 1

                for (x in validNumbers) {
                    result *= x
                }
            }
        }

        return result
    }
}
