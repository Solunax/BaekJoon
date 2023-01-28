import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val score = ArrayList<Int>()

    repeat(n){ s ->
        repeat(br.readLine().toInt()){
            score.add(s+1)
        }
    }

    repeat(m){
        bw.write("${score[br.readLine().toInt()]}\n")
    }

    br.close()
    bw.close()
}

