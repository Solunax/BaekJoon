import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(3){
        var front = 0
        br.readLine().split(" ").forEach {
            if(it == "0")
                front++
        }

        when(front){
            0 -> bw.write("E\n")
            1 -> bw.write("A\n")
            2 -> bw.write("B\n")
            3 -> bw.write("C\n")
            4 -> bw.write("D\n")
        }
    }

    bw.close()
    br.close()
}
