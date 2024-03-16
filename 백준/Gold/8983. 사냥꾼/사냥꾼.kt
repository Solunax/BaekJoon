import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var point: List<Int>
var m = 0
var l = 0

fun main() {
    val (im, n, il) = br.readLine().split(" ").map { it.toInt() }
    val animal = Array(n) { Pair(0, 0) }
    var result = 0
    point = br.readLine().split(" ").map { it.toInt() }.sorted()
    l = il
    m = im

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { v -> v.toInt() }
        animal[it] = Pair(x, y)
    }

    for (location in animal) {
        result += searchPoint(location)
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun searchPoint(location: Pair<Int, Int>): Int {
    var start = 0
    var end = m
    var center: Int

    while (start <= end) {
        center = (start + end) / 2

        val distance = abs(location.first - point[center]) + location.second

        if (l >= distance) {
            return 1
        }

        if (location.first < point[center]) {
            end = center - 1
        } else if (location.first >= point[center]) {
            start = center + 1
        }
    }

    return 0
}