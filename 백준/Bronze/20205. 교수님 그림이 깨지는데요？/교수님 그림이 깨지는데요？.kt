import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val image = Array(n){ Array(n){0} }

    repeat(n){
        image[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    for(i in 0 until n){
        for(l in 0 until m){
            for(j in 0 until n){
                for(k in 0 until m)
                    bw.write("${image[i][j]} ")
            }
            bw.write("\n")
        }
    }

    bw.close()
    br.close()
}