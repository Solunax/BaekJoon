import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, h, w) = br.readLine().split(" ").map { it.toInt() }
    val result = Array(n){'?'}

    for(i in 0 until h){
        val str = br.readLine()

        for(j in 0 until n * w){
            if(str[j] != '?')
                result[j / w] = str[j]
        }
    }

    result.forEach {
        bw.write("$it")
    }

    bw.close()
    br.close()
}