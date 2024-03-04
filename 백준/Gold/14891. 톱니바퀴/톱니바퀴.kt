import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val gear = Array(4) { Array(8) { 0 } }
var spinCheck = Array(4) { 0 }

fun main() {
    repeat(4) {
        gear[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.map { v -> v.toInt() }.toTypedArray()
    }

    repeat(br.readLine().toInt()) {
        val input = br.readLine().split(" ").map { it.toInt() }
        val g = input[0] - 1
        val spin = input[1]

        spinCheck = Array(4) { 0 }
        spinCheck[g] = spin

        checkPossibility(g)
        spin()
    }

    var result = 0
    if (gear[0][0] == 1) {
        result += 1
    }
    if (gear[1][0] == 1) {
        result += 2
    }
    if (gear[2][0] == 1) {
        result += 4
    }
    if (gear[3][0] == 1) {
        result += 8
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun checkPossibility(g: Int) {
    for (i in g - 1 downTo 0) {
        if (gear[i][2] != gear[i + 1][6]) {
            spinCheck[i] = -spinCheck[i + 1]
        } else {
            break
        }
    }

    for (i in g + 1 until 4) {
        if (gear[i][6] != gear[i - 1][2]) {
            spinCheck[i] = -spinCheck[i - 1]
        } else {
            break
        }
    }
}

fun spin() {
    var temp: Int
    for (i in 0 until 4) {
        when (spinCheck[i]) {
            1 -> {
                temp = gear[i][7]
                for (j in 7 downTo 1) {
                    gear[i][j] = gear[i][j - 1]
                }
                gear[i][0] = temp
            }
            -1 -> {
                temp = gear[i][0]
                for (j in 0 until 7) {
                    gear[i][j] = gear[i][j + 1]
                }
                gear[i][7] = temp
            }
        }
    }
}