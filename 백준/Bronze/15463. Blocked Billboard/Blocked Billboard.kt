import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val map = Array(2001){ Array(2001){false} }

    repeat(2){
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt() + 1000 }

        for (y in y1 until y2) {
            for (x in x1 until x2) {
                map[y][x] = true
            }
        }
    }

    val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt() + 1000 }

    for (y in y1 until y2) {
        for (x in x1 until x2) {
            map[y][x] = false
        }
    }

    var count = 0
    map.forEach {
        it.forEach { check ->
            if(check)
                count++
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}