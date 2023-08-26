import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){ idx ->
        val arr = Array(26){0}
        br.readLine().lowercase().forEach { c ->
            if(c in 'a' .. 'z')
                arr[c - 'a']++
        }

        var min = 3
        arr.forEach {
            min = min(it, min)
        }

        bw.write("Case ${idx + 1}: ${
            when(min){
                1 -> "Pangram!"
                2 -> "Double pangram!!"
                3 -> "Triple pangram!!!"
                else -> "Not a pangram"
            }
        }\n")
    }

    bw.close()
    br.close()
}