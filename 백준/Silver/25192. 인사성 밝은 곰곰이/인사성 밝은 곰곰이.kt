import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0
    val set = HashSet<String>()

    repeat(n){ idx ->
        val input = br.readLine()

        if (input == "ENTER") {
            result += set.size
            set.clear()
        } else {
            set.add(input)
        }

        if(idx == n - 1){
            if(input != "ENTER")
                result += set.size
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}