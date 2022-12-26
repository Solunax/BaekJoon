import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val paper = Array(101){Array(101){0}}

    repeat(br.readLine().toInt()){
        val(left, bottom) = br.readLine().split(" ").map{ it.toInt() }

        for(i in bottom until  bottom+10){
            for(j in left until  left+10)
                paper[i][j] = 1
        }
    }

    var result = 0
    paper.forEach {
        it.forEach { v ->
            result += v
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}