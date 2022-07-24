import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max
import kotlin.math.round

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val stack = Stack<Char>()

    var tag = false
    input.forEach {
        if(it == '<') {
            tag = true
            while (stack.isNotEmpty()) {
                bw.write("${stack.pop()}")
            }
            bw.write("<")
        }else if(it == '>') {
            tag = false
            bw.write("$it")
        }else if(tag){
            bw.write("$it")
        }else{
            if(it == ' '){
                while (stack.isNotEmpty()){
                    bw.write("${stack.pop()}")
                }
                bw.write(" ")
            }else
                stack.push(it)
        }
    }

    while (stack.isNotEmpty()){
        bw.write("${stack.pop()}")
    }

    bw.close()
    br.close()
}