import java.io.BufferedReader
import java.io.FileReader

// https://www.hackerrank.com/challenges/beautiful-pairs/problem

fun beautifulPairs(A: Array<Int>, B: Array<Int>): Int {
    val aList = A.toMutableList()
    val bList = B.toMutableList()

    var pairCount = 0
    aList.forEach { value ->
        if (bList.remove(value)) {
            pairCount++
        }
    }

    if (bList.size > 0) {
        pairCount++
    } else {
        pairCount--
    }

    return pairCount
}

fun main() {
    println(
        beautifulPairs(
            "1 2 3 4".split(" ").map { it.toInt() }.toTypedArray(),
            "1 2 3 3".split(" ").map { it.toInt() }.toTypedArray()
        )
    )

    println(
        beautifulPairs(
            "3 5 7 11 5 8".split(" ").map { it.toInt() }.toTypedArray(),
            "5 7 11 10 5 8".split(" ").map { it.toInt() }.toTypedArray()
        )
    )

    val reader = BufferedReader(FileReader("input04.txt"))
    reader.readLine()
    val aList = reader.readLine()
    val bList = reader.readLine()
    println(
        beautifulPairs(
            aList.split(" ").map { it.toInt() }.toTypedArray(),
            bList.split(" ").map { it.toInt() }.toTypedArray()
        )
    )
}