import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ")
    val aArr = a.split("").filter { it.isNotEmpty() }
    val bArr = b.split("").filter { it.isNotEmpty() }

    var result = 0L
    aArr.forEach {
        for(i in bArr)
            result += it.toInt() * i.toInt()
    }

    bw.write("$result")
    bw.close()
    br.close()
}
