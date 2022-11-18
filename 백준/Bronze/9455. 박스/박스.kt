import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (m, n) = br.readLine().split(" ").map { it.toInt() }

        val map = Array(m){Array(n){0}}
        repeat(m){
            map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
        }

        var result = 0
        for(i in 0 until n){
            var count = 0
            for(j in m-1 downTo 0){
                if(map[j][i] == 1)
                    result += (m - j) - (++count)
            }
        }
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}