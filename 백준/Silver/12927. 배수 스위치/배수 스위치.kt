import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val size = input.length
    val state = Array(size + 1){ false }

    for(i in 1 ..size){
        if(input[i - 1] == 'Y')
            state[i] = true
    }

    var result = 0
    for(i in 1 .. size){
        if(state[i]){
            result++
            var j = i
            while(j <= size){
                state[j] = !state[j]
                j += i
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}