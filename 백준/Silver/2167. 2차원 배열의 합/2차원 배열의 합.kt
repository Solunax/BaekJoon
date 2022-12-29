import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(r, c) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(r){Array(c){0}}

    repeat(r){
        arr[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    repeat(br.readLine().toInt()){
        val(x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt()-1 }
        var sum = 0
        for(i in x1 .. x2){
            for(j in y1 .. y2)
                sum += arr[i][j]
        }

        bw.write("$sum\n")
    }

    br.close()
    bw.close()
}