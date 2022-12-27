import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = Array(9){Array(9){0}}

    repeat(9){
        arr[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    var max = 0
    var r = 0
    var c = 0

    for(i in 0 until 9){
        for(j in 0 until 9){
            if(max < arr[i][j]){
                max = arr[i][j]
                r = i
                c = j
            }
        }
    }
    bw.write("$max\n")
    bw.write("${r+1} ${c+1}")

    br.close()
    bw.close()
}