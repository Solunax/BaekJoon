import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    val (_, _, pr, pc) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(r){ Array(c){""} }

    repeat(r) { y ->
        map[y] = br.readLine().split("").filter { it.isNotEmpty() }.toTypedArray()
    }

    val total = pr * pc
    var count = 0
    for(y in 0 until r){
        for(x in 0 until c){
            if(map[y][x] == "P")
                count++
        }
    }

    if(total != count)
        bw.write("1")
    else
        bw.write("0")

    bw.close()
    br.close()
}