import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val stack = Stack<String>()

    repeat(n){
        br.readLine().split(" ").forEach { v ->
            stack.push(v)
        }

        bw.write("Case #${it+1}: ")
        while (stack.isNotEmpty()){
            bw.write("${stack.pop()} ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}