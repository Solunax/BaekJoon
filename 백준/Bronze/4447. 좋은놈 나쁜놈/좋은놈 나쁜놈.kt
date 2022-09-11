import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    repeat(br.readLine().toInt()){
        val input = br.readLine()
        var good = 0
        var bad = 0
        input.forEach {
            if(it == 'g' || it == 'G')
                good++
            if(it == 'b' || it == 'B')
                bad++
        }

        val result = if(good > bad)
            "GOOD"
        else if(good < bad)
            "A BADDY"
        else
            "NEUTRAL"

        bw.write("$input is $result\n")
    }

    bw.close()
    br.close()
}