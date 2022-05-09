import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val input = br.readLine().split(" ").map{ it.toInt() }
val tokenizer = StringTokenizer(br.readLine())

var sumArray = LongArray(input[0] + 1){0}
var array = LongArray(input[1]){0}

fun main() {
    var index = 1
    while(tokenizer.hasMoreTokens()){
        sumArray[index] = tokenizer.nextToken().toLong()
        sumArray[index] = (sumArray[index] + sumArray[index - 1]) % input[1]
        array[sumArray[index].toInt()]++
        index++
    }

    var result = array[0]

    for(i in 0 until input[1]){
        result += array[i] * (array[i] - 1) / 2
    }


    bw.write("$result\n")
    bw.flush()

    br.close()
    bw.close()
}