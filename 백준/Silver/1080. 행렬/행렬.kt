import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arrayA = Array(n){Array(m) { 0 } }
    val arrayB = Array(n){Array(m) { 0 } }

    for(i in 0 until n)
        arrayA[i] = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()

    for(i in 0 until n)
        arrayB[i] = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()

    var result = 0
    for(i in 0 .. n - 3){
        for(j in 0 .. m - 3){
            if(arrayA[i][j] != arrayB[i][j]){
                result++
                for(x in i until i + 3){
                    for(y in j until j + 3){
                        arrayA[x][y] = if(arrayA[x][y] == 0)
                            1
                        else
                            0
                    }
                }
            }
        }
    }

    var flag = true
    for(i in 0 until n){
        for(j in 0 until m){
            if(arrayA[i][j] != arrayB[i][j]){
                flag = false
                break
            }
        }
    }
    if(flag)
        bw.write("$result")
    else
        bw.write("-1")

    bw.close()
    br.close()
}
