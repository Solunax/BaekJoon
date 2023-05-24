import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val regex = Regex("^[A-F]?A+F+C+[A-F]?$")

    repeat(br.readLine().toInt()){
        if(br.readLine().matches(regex))
            bw.write("Infected!\n")
        else
            bw.write("Good\n")
    }

    bw.close()
    br.close()
}