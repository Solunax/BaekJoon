import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split("").filter { it.isNotEmpty() }
        val sb = StringBuilder()
        var ttt = 0
        var tth = 0
        var tht = 0
        var thh = 0
        var htt = 0
        var hth = 0
        var hht = 0
        var hhh = 0

        for(i in 0 until 38){
            sb.append(input[i])
            sb.append(input[i+1])
            sb.append(input[i+2])

            when(sb.toString()){
                "HHH" -> hhh++
                "HHT" -> hht++
                "HTH" -> hth++
                "HTT" -> htt++
                "THH" -> thh++
                "THT" -> tht++
                "TTH" -> tth++
                "TTT" -> ttt++
            }
            sb.clear()
        }

        bw.write("$ttt $tth $tht $thh $htt $hth $hht $hhh\n")
    }

    bw.close()
    br.close()
}