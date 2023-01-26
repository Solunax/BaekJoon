import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val picture = Array(100){Array(100){0}}
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }

    repeat(n){
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt()-1 }

        for(i in x1 .. x2){
            for(j in y1 .. y2)
                picture[i][j]++
        }
    }

    var result = 0
    picture.forEach {
        it.forEach { v ->
            if(v > m)
                result++
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}