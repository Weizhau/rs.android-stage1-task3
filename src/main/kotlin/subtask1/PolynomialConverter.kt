package subtask1

import java.lang.StringBuilder
import kotlin.math.sign

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        val output = StringBuilder();
        if (numbers.size > 0) {
            var i = numbers.size - 1
            for (i in 0..numbers.size - 1) {
                val power = numbers.size - 1 - i
                val num = Math.abs(numbers[i])
                var sign: String = "err"
                when (Integer.signum(numbers[i])) {
                    -1 -> sign = "-"
                    1 -> sign = "+"
                }



                if (num != 0) {
                    if (Math.abs(num) != 1) {
                        if (power > 1) {
                            output.append("$sign $num" +  "x^" + "$power ")
                        } else if (power == 1) {
                            output.append("$sign $num" + "x ")
                        } else {
                            output.append("$sign $num")
                        }
                    } else {
                        if (power > 1) {
                            output.append(" x^" + "$power ")
                        } else if (power == 1) {
                            output.append("$sign x ")
                        } else {
                           // output.append(" $num")
                        }
                    }

                }
            }

        } else {
            return null;
        }

        return output.toString().substring(2);
    }
}
