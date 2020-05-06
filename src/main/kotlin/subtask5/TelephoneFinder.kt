package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val output = ArrayList<String>()
        if (number[0] == '-') {
            return null
        }

        if (number.length == 1) {
            when (number[0]) {
                '1' -> {
                    output.add("2")
                    output.add("4")
                }
                '2' -> {
                    output.add("1")
                    output.add("3")
                    output.add("5")
                }
                '3' -> {
                    output.add("2")
                    output.add("6")
                }
                '4' -> {
                    output.add("1")
                    output.add("5")
                    output.add("7")
                }
                '5' -> {
                    output.add("2")
                    output.add("4")
                    output.add("6")
                    output.add("8")
                }
                '6' -> {
                    output.add("3")
                    output.add("5")
                    output.add("9")
                }
                '7' -> {
                    output.add("4")
                    output.add("8")
                }
                '8' -> {
                    output.add("5")
                    output.add("7")
                    output.add("9")
                    output.add("0")
                }
                '9' -> {
                    output.add("6")
                    output.add("8")
                }
                '0' -> {
                    output.add("8")
                }
            }
        } else {
            for (i in 0..number.length - 2) {
                when (number[i]) {
                    '1' -> {
                        output.add(number.substring(0, i) + "2" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "4" + number.substring(i + 1))
                    }
                    '2' -> {
                        output.add(number.substring(0, i) + "1" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "3" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "5" + number.substring(i + 1))
                    }
                    '3' -> {
                        output.add(number.substring(0, i) + "2" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "6" + number.substring(i + 1))
                    }
                    '4' -> {
                        output.add(number.substring(0, i) + "1" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "5" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "7" + number.substring(i + 1))
                    }
                    '5' -> {
                        output.add(number.substring(0, i) + "2" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "4" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "6" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "8" + number.substring(i + 1))
                    }
                    '6' -> {
                        output.add(number.substring(0, i) + "3" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "5" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "9" + number.substring(i + 1))
                    }
                    '7' -> {
                        output.add(number.substring(0, i) + "4" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "8" + number.substring(i + 1))
                    }
                    '8' -> {
                        output.add(number.substring(0, i) + "5" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "7" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "9" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "0" + number.substring(i + 1))
                    }
                    '9' -> {
                        output.add(number.substring(0, i) + "6" + number.substring(i + 1))
                        output.add(number.substring(0, i) + "8" + number.substring(i + 1))
                    }
                    '0' -> {
                        output.add(number.substring(0, i) + "8" + number.substring(i + 1))
                    }
                }
            }
            when (number[number.length - 1]) {
                '1' -> {
                    output.add(number.substring(0, number.length - 1) + "2")
                    output.add(number.substring(0, number.length - 1) + "4")
                }
                '2' -> {
                    output.add(number.substring(0, number.length - 1) + "1")
                    output.add(number.substring(0, number.length - 1) + "3")
                    output.add(number.substring(0, number.length - 1) + "5")
                }
                '3' -> {
                    output.add(number.substring(0, number.length - 1) + "2")
                    output.add(number.substring(0, number.length - 1) + "6")
                }
                '4' -> {
                    output.add(number.substring(0, number.length - 1) + "1")
                    output.add(number.substring(0, number.length - 1) + "5")
                    output.add(number.substring(0, number.length - 1) + "7")
                }
                '5' -> {
                    output.add(number.substring(0, number.length - 1) + "2")
                    output.add(number.substring(0, number.length - 1) + "4")
                    output.add(number.substring(0, number.length - 1) + "6")
                    output.add(number.substring(0, number.length - 1) + "8")
                }
                '6' -> {
                    output.add(number.substring(0, number.length - 1) + "3")
                    output.add(number.substring(0, number.length - 1) + "5")
                    output.add(number.substring(0, number.length - 1) + "9")
                }
                '7' -> {
                    output.add(number.substring(0, number.length - 1) + "4")
                    output.add(number.substring(0, number.length - 1) + "8")
                }
                '8' -> {
                    output.add(number.substring(0, number.length - 1) + "5")
                    output.add(number.substring(0, number.length - 1) + "7")
                    output.add(number.substring(0, number.length - 1) + "9")
                    output.add(number.substring(0, number.length - 1) + "0")
                }
                '9' -> {
                    output.add(number.substring(0, number.length - 1) + "6")
                    output.add(number.substring(0, number.length - 1) + "8")
                }
                '0' -> {
                    output.add(number.substring(0, number.length - 1) + "8")
                }
            }
        }




        return output.toTypedArray()
    }
}
