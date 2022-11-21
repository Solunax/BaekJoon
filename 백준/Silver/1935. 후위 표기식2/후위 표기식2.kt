import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val stack = Stack<Double>()
    val string = br.readLine()

    val num = Array(n){0.0}
    repeat(n){
        num[it] = br.readLine().toDouble()
    }

    string.forEach {
        if(it in 'A' .. 'Z')
            stack.add(num[it-'A'])
        else{
            val v1 = stack.pop()
            val v2 = stack.pop()
            when(it){
                '+' -> stack.push(v1 + v2)
                '-' -> stack.push(v2 - v1)
                '*' -> stack.push(v1 * v2)
                '/' -> stack.push(v2 / v1)
            }
        }
    }

    bw.write("%.2f".format(stack.pop()))

    bw.close()
    br.close()
}