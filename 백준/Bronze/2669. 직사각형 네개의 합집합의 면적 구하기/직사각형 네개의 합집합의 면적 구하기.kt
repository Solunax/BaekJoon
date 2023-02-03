import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val map = Array(101){ Array(101){0} }

    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        val (x1, y1, x2, y2) = input.split(" ").map { it.toInt() }
        for(y in y1 until y2){
            for(x in x1 until  x2)
                map[y][x] = 1
        }
    }

    var result = 0
    map.forEach {
        it.forEach { v ->
            result += v
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}