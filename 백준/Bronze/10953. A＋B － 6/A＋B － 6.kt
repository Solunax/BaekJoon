import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    repeat(br.readLine().toInt()){
        var sum = 0
        br.readLine().split(",").map{ it.toInt() }.forEach{
            sum += it
        }

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}