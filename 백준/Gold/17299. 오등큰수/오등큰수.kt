import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }
    val count = Array(1000001){0}
    val result = Array(n){0}
    val stack = Stack<Int>()
    var max = -1

    numbers.forEach {
        count[it]++
    }

    for(i in n-1 downTo 0){
        val now = count[numbers[i]]
        if(stack.isNotEmpty() && now >= max)
            stack.clear()

        while(stack.isNotEmpty()){
            val index = stack.peek()
            
            if(count[numbers[index]] > now){
                result[i] = numbers[index]
                break
            }else
                stack.pop()
        }

        max = max(max, now)
        if(stack.isEmpty())
            result[i] = -1

        stack.add(i)
    }

    result.forEach {
        bw.write("$it ")
    }

    br.close()
    bw.close()
}