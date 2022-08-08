import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val stack = Stack<Pair<Int, Int>>()
    val tops = Array(n){Pair(0, 0)}
    val input = br.readLine().split(" ").map { it.toInt() }

    for(i in 0 until n)
        tops[i] = Pair(i + 1, input[i])

    for(i in input.indices){
        val now = tops[i].second
        while (stack.isNotEmpty()){
            if(stack.peek().second >= now){
                bw.write("${stack.peek().first} ")
                break
            }
            stack.pop()
        }

        if(stack.empty())
            bw.write("0 ")
        stack.push(tops[i])
    }

    bw.close()
    br.close()
}