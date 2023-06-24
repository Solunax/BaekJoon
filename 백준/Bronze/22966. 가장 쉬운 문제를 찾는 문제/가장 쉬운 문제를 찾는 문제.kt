import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = ""
    var difficulty = 5
    repeat(br.readLine().toInt()){
        val (name, diff) = br.readLine().split(" ")

        if(diff.toInt() < difficulty){
            result = name
            difficulty = diff.toInt()
        }
    }

    bw.write(result)

    bw.close()
    br.close()
}