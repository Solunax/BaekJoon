import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Long.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = br.readLine().split(" ").map { it.toInt() }
val visit = Array(input[0]){false}
val array = Array(input[1]){0}

fun main() {
    track(input[0], input[1], 0)

    br.close()
    bw.close()
}

fun track(n:Int, m:Int, count:Int){
    if(count == m){
        array.forEach {
            bw.write("$it ")
        }
        bw.write("\n")
        bw.flush()
        return
    }

    for(i in 0 until n){
        if(!visit[i]){
            visit[i] = true
            array[count] = i + 1
            track(n, m, count + 1)
            visit[i] = false
        }
    }
}