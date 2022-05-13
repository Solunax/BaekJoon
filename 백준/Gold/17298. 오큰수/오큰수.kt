import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val numberCount = br.readLine().toInt()
val array = ArrayList<Int>()
val stack = Stack<Int>()

fun main() {
    br.readLine().split(" ").map{ it.toInt() }.forEach{
        array.add(it)
    }

    for(i in 0 until numberCount){
        while(!stack.isEmpty() && array[stack.peek()] < array[i]){
            array[stack.pop()] = array[i]
        }
        stack.push(i)
    }

    while(!stack.isEmpty())
        array[stack.pop()] = -1

    array.forEach {
        bw.write("$it ")
    }

    br.close()
    bw.close()
}