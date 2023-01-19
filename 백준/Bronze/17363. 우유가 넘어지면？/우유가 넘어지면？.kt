import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }
    val input = Array(n){ Array(m){""} }

    repeat(n){
        input[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    for(i in m-1 downTo 0){
        for(j in 0 until n){
            when(input[j][i]){
                "-" -> bw.write("|")
                "|" -> bw.write("-")
                "/" -> bw.write("\\")
                "\\" -> bw.write("/")
                "^" -> bw.write("<")
                "<" -> bw.write("v")
                "v" -> bw.write(">")
                ">" -> bw.write("^")
                else -> bw.write(input[j][i])
            }
        }

        bw.write("\n")
    }

    br.close()
    bw.close()
}