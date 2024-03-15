import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val set = HashSet<String>()
    val n = br.readLine().toInt()
    val strings = Array(n) { "" }

    repeat(n) {
        strings[it] = br.readLine()
    }

    strings.sortWith { o1, o2 ->
        o2.length - o1.length
    }

    for (i in 0 until n) {
        var check = true
        set.forEach {
            if (it.indexOf(strings[i]) == 0) {
                check = false
            }
        }

        if (check) {
            set.add(strings[i])
        }
    }
    bw.write("${set.size}")

    bw.close()
    br.close()
}