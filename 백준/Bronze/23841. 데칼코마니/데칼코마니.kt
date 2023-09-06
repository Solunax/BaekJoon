import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val paint = Array(n){ Array(m){""} }

    repeat(n){
        paint[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    repeat(n){
        for(i in 0 until m / 2){
            if(paint[it][i] != ".")
                paint[it][m - i - 1] = paint[it][i]
            else if(paint[it][m - i - 1] != ".")
                paint[it][i] = paint[it][m - i - 1]
        }
    }

    paint.forEach {
        it.forEach { v ->
            bw.write(v)
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}