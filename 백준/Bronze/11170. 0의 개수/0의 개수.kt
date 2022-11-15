import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        var result = 0

        for(i in start .. end){
            i.toString().forEach {
                if(it == '0')
                    result++
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}

