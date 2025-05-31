import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = ArrayList<Input>()

    repeat(m) {
        val (a, b, c) = br.readLine().split(" ")
        arr.add(Input(a.toInt(), b.toInt(), c))
    }
    arr.sort()

    for (data in arr) {
        bw.write(data.key)
    }

    bw.close()
    br.close()
}

data class Input(val num: Int, val time: Int, val key: String) : Comparable<Input> {
    override fun compareTo(other: Input): Int {
        return if (this.time != other.time) {
            this.time - other.time
        } else {
            this.num - other.num
        }
    }
}