import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    br.readLine()
    val target = br.readLine().split(" ").map { it.toInt() }
    val score = Array(n){0}

    target.forEach { t ->
        val input = br.readLine().split(" ").map { v -> v.toInt() }
        var diff = 0

        input.forEach {
            if(t != it)
                diff++
        }

        for(i in 0 until n){
            if(i + 1 == t)
                score[i] += 1 + diff
            else
                score[i] += if(input[i] == t)
                    1
                else
                    0
        }
    }

    score.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}