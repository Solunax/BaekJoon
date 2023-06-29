import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0
    var time = 0
    val question = Array(11){ Array(2){0} }

    repeat(11){
        question[it] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    }

    question.sortWith{ v1, v2 ->
        v1[0] - v2[0]
    }

    repeat(11){
        result += time + question[it][0] + 20 * question[it][1]
        time += question[it][0]
    }

    bw.write("$result")

    bw.close()
    br.close()
}