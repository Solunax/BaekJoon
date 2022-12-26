import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr1 = Array(n){ Array(m){0} }
    val arr2 = Array(n){ Array(m){0} }

    repeat(n){
        arr1[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    repeat(n){
        arr2[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    for(i in 0 until n){
        for(j in 0 until m)
            bw.write("${arr1[i][j] + arr2[i][j]} ")

        bw.write("\n")
    }

    br.close()
    bw.close()
}