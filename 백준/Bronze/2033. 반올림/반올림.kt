import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()

    for(i in n.size-1 downTo 1){
        if(n[i] >= 5)
            n[i-1] += 1

        n[i] = 0
    }

    n.forEach {
        bw.write("$it")
    }

    bw.close()
    br.close()
}