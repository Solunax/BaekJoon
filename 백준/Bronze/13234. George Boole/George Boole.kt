import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, boole, b) = br.readLine().split(" ")

    when(boole){
        "OR" -> bw.write("${a.toBoolean() || b.toBoolean()}")
        "AND" -> {
            if(a == b && a == "true")
                bw.write("true")
            else
                bw.write("false")
        }
    }

    bw.close()
    br.close()
}