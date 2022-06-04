import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(n, m) = br.readLine().split(" ").map { it.toInt() }
    val array1 = Array(n){Array(m){0} }
    for(i in 0 until n)
        array1[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    val(p, k) = br.readLine().split(" ").map { it.toInt() }
    val array2 = Array(p){Array(k){0} }
    for(i in 0 until p)
        array2[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    val resultArray = Array(n){Array(k){0} }
    for(i in 0 until n){
        for(j in 0 until k){
            for(k in 0 until m){
                resultArray[i][j] += array1[i][k] * array2[k][j]
            }
        }
    }

    for(i in 0 until n){
        for(j in 0 until k)
            bw.write("${resultArray[i][j]} ")
        bw.write("\n")
    }

    bw.close()
    br.close()
}