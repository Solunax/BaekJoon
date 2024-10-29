import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val map = HashMap<String, Int>()

    repeat(n) {
        val name = br.readLine()

        if (map[name] == null) {
            map[name] = 1
        } else {
            map[name] = map[name]!! + 1
        }
    }

    repeat(n - 1) {
        val name = br.readLine()
        map[name] = map[name]!! - 1
    }

    map.forEach { (name, count) ->
        if (count != 0) {
            bw.write(name)
        }
    }

    bw.close()
    br.close()
}