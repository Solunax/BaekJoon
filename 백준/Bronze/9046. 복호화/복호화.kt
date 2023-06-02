import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max


val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()
        val arr = Array(26){0}

        input.forEach {
            if(it != ' ')
                arr[it - 'a']++
        }

        var maxValue = 0
        arr.forEach {
            maxValue = max(maxValue, it)
        }

        var result = 0
        var count = 0
        for(i in 0 until 26){
            if(maxValue == arr[i]){
                result = i
                count++
            }
        }

        if(count == 1)
            bw.write("${'a' + result}\n")
        else
            bw.write("?\n")
    }

    bw.close()
    br.close()
}