import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    bw.write("int a;\n")
    bw.write("int *ptr = &a;\n")

    var count = 2
    for(i in 1 until n){
        val left = StringBuilder("int ")
        val right = StringBuilder("&ptr")

        repeat(count){
            left.append("*")
        }
        left.append("ptr$count")

        if(count != 2)
            right.append("${count - 1}")
        count++

        bw.write("$left = $right;\n")
    }


    bw.close()
    br.close()
}