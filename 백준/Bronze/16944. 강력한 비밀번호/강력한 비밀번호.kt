import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val specialSymbol = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+')

    var numberCount = 0
    var lower = 0
    var upper = 0
    var special = 0

    var lengthCount = br.readLine().toInt()
    br.readLine().forEach {
        when(it){
            in '0' .. '9' -> numberCount++
            in 'A' ..'Z' -> upper++
            in 'a' ..'z' -> lower++
            in 'A' ..'Z' -> upper++
            in specialSymbol -> special++
        }
    }

    var result = 0
    if(special == 0){
        result++
        lengthCount++
    }

    if(numberCount == 0){
        result++
        lengthCount++
    }

    if(upper == 0){
        result++
        lengthCount++
    }

    if(lower == 0){
        result++
        lengthCount++
    }

    if(lengthCount < 6)
        result += (6-lengthCount)

    bw.write("$result")

    br.close()
    bw.close()
}