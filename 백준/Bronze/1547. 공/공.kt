import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val cups = Array(3){false}
    cups[0] = true

    repeat(br.readLine().toInt()){
        val (from, to) = br.readLine().split(" ").map { it.toInt()-1 }
        cups[from] = cups[to].also { cups[to] = cups[from] }
    }

    for(i in 0 until 3){
        if(cups[i]){
            bw.write("${i+1}")
            break
        }
    }

    bw.close()
    br.close()
}