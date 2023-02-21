import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var sum = 0
        br.readLine().forEach{
            if(it != ' ')
                sum += it - 'A' + 1
        }

        when(sum){
            100 -> bw.write("PERFECT LIFE\n")
            else -> bw.write("$sum\n")
        }
    }

    br.close()
    bw.close()
}