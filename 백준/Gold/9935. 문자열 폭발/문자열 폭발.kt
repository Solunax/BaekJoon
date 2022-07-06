import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.Stack
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    val input = br.readLine()
    val bomb = br.readLine()
    val stack = Stack<Char>()

    val bombSize = bomb.length
    input.forEach {
        stack.push(it)
        if(stack.size >= bombSize){
            var check = true
            for(i in bomb.indices){
                val v1 = stack[stack.size - bombSize + i]
                val v2 = bomb[i]
                if(v1 != v2){
                    check = false
                    break
                }
            }
            if(check){
                for(i in bomb.indices)
                    stack.pop()
            }
        }
    }

    if(stack.size != 0){
        stack.forEach {
            bw.write("$it")
        }
    }else
        bw.write("FRULA")

    bw.close()
    br.close()
}