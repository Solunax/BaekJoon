import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val stack = Stack<Int>()

    repeat(n){
        stack.push(br.readLine().toInt())
    }

    var result = 0
    var recent = 0
    repeat(n){
        val temp = stack.pop()
        if(temp > recent){
            result++
            recent = temp
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}