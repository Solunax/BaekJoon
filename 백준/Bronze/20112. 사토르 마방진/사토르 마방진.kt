import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n){ Array(n){""} }

    repeat(n){
        arr[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    var check = true

    for(i in 0 until n){
        for(j in 0 until n){
            if(arr[i][j] != arr[j][i]){
                check = false
                break
            }
        }
    }

    if(check)
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}