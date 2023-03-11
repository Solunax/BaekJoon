import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val cake = Array(br.readLine().toInt() +  1){0}
    val n = br.readLine().toInt()

    var wantMax = 0
    var wantMaxLen = 0
    var realMax = 0
    var realMaxLen = 0

    repeat(n){
        val (left, right) = br.readLine().split(" ").map { v -> v.toInt() }

        if(right - left > wantMaxLen){
            wantMaxLen = right - left
            wantMax = it + 1
        }

        var realCount = 0
        for(i in left .. right){
            if(cake[i] == 0){
                cake[i] = it + 1
                realCount++
            }
        }

        if(realCount > realMaxLen){
            realMaxLen = realCount
            realMax = it + 1
        }
    }

    bw.write("$wantMax\n$realMax")

    br.close()
    bw.close()
}