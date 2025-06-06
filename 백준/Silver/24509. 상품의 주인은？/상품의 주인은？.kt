import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var student: BooleanArray

fun main() {
    val n = br.readLine().toInt()
    student = BooleanArray(n + 1)
    val kor = PriorityQueue<Compare>()
    val eng = PriorityQueue<Compare>()
    val math = PriorityQueue<Compare>()
    val sci = PriorityQueue<Compare>()

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val num = st.nextToken().toInt()
        kor.add(Compare(Pair(num, st.nextToken().toInt())))
        eng.add(Compare(Pair(num, st.nextToken().toInt())))
        math.add(Compare(Pair(num, st.nextToken().toInt())))
        sci.add(Compare(Pair(num, st.nextToken().toInt())))
    }

    getResult(kor)
    getResult(eng)
    getResult(math)
    getResult(sci)

    bw.close()
    br.close()
}

fun getResult(pq: PriorityQueue<Compare>) {
    while (pq.isNotEmpty() && student[pq.peek().data.first]) {
        pq.poll()
    }
    val idx = pq.peek().data.first
    student[idx] = true
    bw.write("$idx ")
}

data class Compare(val data: Pair<Int, Int>) : Comparable<Compare> {
    override fun compareTo(other: Compare): Int {
        return if (data.second == other.data.second) {
            data.first - other.data.first
        } else {
            other.data.second - data.second
        }
    }
}