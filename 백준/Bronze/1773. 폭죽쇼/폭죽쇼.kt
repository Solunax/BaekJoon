import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, end) = br.readLine().split(" ").map { it.toInt() }
    val time = Array(n){0}

    repeat(n){
        time[it] = br.readLine().toInt()
    }

    var result = 0
    for(i in 1 .. end){
        var check = false
        for(t in time){
            if(i % t == 0){
                check = true
                break
            }
        }

        if(check)
            result++
    }

    bw.write("$result")

    bw.close()
    br.close()
}