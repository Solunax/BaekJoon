import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDateTime
import java.time.ZoneId

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val time = LocalDateTime.now(ZoneId.of("UTC"))
    bw.write("${time.year}\n${time.monthValue}\n${time.dayOfMonth}")

    bw.close()
    br.close()
}