import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val n = br.readLine().toInt()
val triangle = Array(n){Array(n) { 0 } }
val result = Array(n){Array(n) { -1 } }

fun main() {

    for(i in 0 until n)
        triangle[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    for(i in 0 until n)
        result[n - 1][i] = triangle[n - 1][i]

    bw.write("${findResult(0, 0)}")
    br.close()
    bw.close()
}

fun findResult(depth:Int, index:Int):Int{
    if(depth == n - 1)
        return result[depth][index]

    if(result[depth][index] == -1)
        result[depth][index] = max(findResult(depth + 1, index), findResult(depth + 1, index + 1)) + triangle[depth][index]

    return result[depth][index]
}