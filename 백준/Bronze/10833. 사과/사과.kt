import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var left = 0
    repeat(br.readLine().toInt()){
        val(student, apple) = br.readLine().split(" ").map { it.toInt() }

        left += apple % student
    }

    bw.write("$left")

    br.close()
    bw.close()
}