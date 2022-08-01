import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val stack = Stack<Pair<Int, Int>>()

    var result = 0
    repeat(n){
        val input = br.readLine().split(" ").map{ it.toInt() }
        if(input[0] == 0){
            if(stack.isNotEmpty()){
                val temp = stack.pop()
                val recent = temp.second - 1
                if(recent == 0)
                    result += temp.first
                else
                    stack.push(Pair(temp.first, recent))
            }
        }else{
            if(input[2] - 1 == 0)
                result += input[1]
            else{
                val info = Pair(input[1], input[2] - 1)
                stack.push(info)
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}