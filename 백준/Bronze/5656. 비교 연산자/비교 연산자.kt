import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var index = 1
    while(true){
        val (v1, op, v2) = br.readLine().split(" ")

        if(op == "E")
            break

        val result = when(op){
            ">" -> v1.toInt() > v2.toInt()
            ">=" -> v1.toInt() >= v2.toInt()
            "<" -> v1.toInt() < v2.toInt()
            "<=" -> v1.toInt() <= v2.toInt()
            "==" -> v1.toInt() == v2.toInt()
            "!=" -> v1.toInt() != v2.toInt()
            else -> true
        }

        bw.write("Case ${index++}: $result\n")
    }

    br.close()
    bw.close()
}