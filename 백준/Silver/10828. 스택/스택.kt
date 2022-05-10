import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val array = ArrayList<Int>()
var top = -1
fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val command = br.readLine().split(" ")

        when(command[0]){
            "push" -> { push(command[1].toInt()) }
            "pop" -> { bw.write("${pop()}\n") }
            "size" -> { bw.write("${array.size}\n")}
            "empty" -> { bw.write("${empty()}\n")}
            "top" -> { bw.write("${checkTop()}\n")}
        }
    }
    bw.flush()
    br.close()
    bw.close()
}

fun push(value:Int) {
    array.add(value)
    top++
}

fun pop():Int{
    return if(top == -1)
        top
    else{
        top--
        return array.removeLast()
    }
}

fun empty():Int{
    return if(array.size == 0)
        1
    else
        0
}

fun checkTop():Int{
    return if(top == -1)
        -1
    else
        array.last()
}