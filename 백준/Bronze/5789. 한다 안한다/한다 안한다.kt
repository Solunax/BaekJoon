import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }
        val center = input.size/2

        if(input[center] == input[center-1])
            bw.write("Do-it\n")
        else
            bw.write("Do-it-Not\n")
    }

    bw.close()
    br.close()
}