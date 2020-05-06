package subtask3

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var validNumbers = ArrayList<Int>();
        var result = 0

        itemsFromArray.filterIsInstanceTo(validNumbers, Int::class.javaObjectType)

        if (numberOfItems < validNumbers.size) {
            val outNumbers = ArrayList<Int>()

            if (validNumbers.size > 0) {
                for (i in 0..numberOfItems - 1) {
                    if (Math.abs(validNumbers.max()!!) > Math.abs(validNumbers.min()!!)) {
                        outNumbers.add(validNumbers.max()!!)
                        validNumbers.remove(validNumbers.max()!!)
                    } else {
                        outNumbers.add(validNumbers.min()!!)
                        validNumbers.remove(validNumbers.min()!!)
                    }
                }

                while (countMinuses(outNumbers) % 2 != 0) {
                    outNumbers.remove(outNumbers.min()!!)
                    outNumbers.add(validNumbers.max()!!)
                    validNumbers.remove(validNumbers.max()!!)
                }


                result = 1
                for (num in outNumbers) {
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

    fun countMinuses(arr: ArrayList<Int>): Int {
        var count = 0
        for (x in arr) {
            if (x < 0) count++
        }
        return count
    }
}
