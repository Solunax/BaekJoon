import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = IntArray(1001)
    var start = Int.MAX_VALUE
    var end = 0
    var result = 0

    repeat(n) {
        val (l, h) = br.readLine().split(" ").map { it.toInt() }
        arr[l] = h
        start = min(l, start)
        end = max(l, end)
    }

    val stack = Stack<Int>()
    var temp = arr[start]

    for (i in start + 1..end) {
        if (arr[i] < temp) {
            stack.push(i)
        } else {
            while (stack.isNotEmpty()) {
                arr[stack.pop()] = temp
            }

            temp = arr[i]
        }
    }
    stack.clear()

    temp = arr[end]

    for (i in end - 1 downTo start) {
        if (arr[i] < temp) {
            stack.push(i)
        } else {
            while (stack.isNotEmpty()) {
                arr[stack.pop()] = temp
            }
            temp = arr[i]
        }
    }

    for (i in start..end) {
        result += arr[i]
    }
    bw.write("$result")

    bw.close()
    br.close()
}