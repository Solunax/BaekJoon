import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val encrypt = br.readLine()
    val key = encrypt[0].code xor 'C'.code

    encrypt.forEach {
        bw.write("${(it.code xor key).toChar()}")
    }

    bw.close()
    br.close()
}