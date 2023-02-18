import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var head = br.readLine().toInt()
        br.readLine().forEach { v ->
            when(v){
                'c' -> head += 1
                'b' -> head -= 1
            }
        }

        bw.write("Data Set ${it+1}:\n$head\n\n")
    }

    br.close()
    bw.close()
}