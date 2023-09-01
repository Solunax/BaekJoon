import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val map = Array(n){ Array(n){0} }

    repeat(n){
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    for(k in 0 until n){
        for(i in 0 until n){
            for(j in 0 until n){
                if(map[i][k] == 1 && map[k][j] == 1)
                    map[i][j] = 1
            }
        }
    }

    map.forEach { v ->
        v.forEach {
            bw.write("$it ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}