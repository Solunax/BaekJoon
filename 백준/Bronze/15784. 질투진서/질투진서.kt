import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, a, b) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n){ Array(n) {0} }

    repeat(n){
        arr[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    val point  = arr[a - 1][b - 1]
    var check = true

    for(i in 0 until n){
        if(arr[i][b - 1] > point){
            check = false
            break
        }
    }

    if(check){
        for(i in 0 until n){
            if(arr[a - 1][i] > point){
                check = false
                break
            }
        }
    }

    if(check)
        bw.write("HAPPY")
    else
        bw.write("ANGRY")

    bw.close()
    br.close()
}