import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map{ it.toInt() }
    val arr = Array(n){0}

    repeat(n){
        arr[it] = br.readLine().toInt()
    }

    var count = 0
    var index = 0
    var check = true
    val visit = Array(n){false}
    while (true){
        count++

        if(arr[index] == k)
            break

        if(visit[arr[index]]){
            check = false
            break
        } else {
            index = arr[index]
            visit[index] = true
        }
    }

    if(!check){
        bw.write("-1")
    } else {
        bw.write("$count")
    }

    bw.close()
    br.close()
}