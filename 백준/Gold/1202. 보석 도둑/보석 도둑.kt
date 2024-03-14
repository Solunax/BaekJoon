import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val jewelries = ArrayList<Jewelry>()
    val bagSize = Array(k) { 0 }

    repeat(n) {
        val (weight, value) = br.readLine().split(" ").map { it.toInt() }
        jewelries.add(Jewelry(weight, value))
    }

    jewelries.sortWith { o1, o2 ->
        if (o1.weight != o2.weight) {
            o1.weight.compareTo(o2.weight)
        } else {
            o2.value.compareTo(o1.value)
        }
    }

    repeat(k) {
        bagSize[it] = br.readLine().toInt()
    }
    bagSize.sort()

    val bag = PriorityQueue<Int>(Comparator.reverseOrder())
    var result = 0L
    var index = 0

    for (i in 0 until k) {
        while (index < n && jewelries[index].weight <= bagSize[i]) {
            bag.offer(jewelries[index].value)
            index++
        }

        if (bag.isNotEmpty()) {
            result += bag.poll()
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

class Jewelry(val weight: Int, val value: Int)