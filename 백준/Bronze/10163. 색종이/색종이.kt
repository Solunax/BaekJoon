import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val paper = Array(1001){ Array(1001){-1} }
    val count = Array(n){0}

    repeat(n){
        val(v1, v2, xP, yP) = br.readLine().split(" ").map{ v -> v.toInt() }

        for(x in v1 until v1 + xP){
            for(y in v2 until  v2 + yP)
                paper[x][y] = it
        }
    }

    paper.forEach {
        it.forEach { v ->
            if(v >= 0)
                count[v]++
        }
    }

    count.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}