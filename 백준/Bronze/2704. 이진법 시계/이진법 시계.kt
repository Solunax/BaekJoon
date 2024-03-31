import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val sb = StringBuilder()

    repeat(br.readLine().toInt()) {
        val (h, m, s) = br.readLine().split(":").map { Integer.toBinaryString(it.toInt()) }
        val strH = makeString(h)
        val strM = makeString(m)
        val strS = makeString(s)


        repeat(6) {
            sb.append("${strH[it]}${strM[it]}${strS[it]}")
        }

        bw.write("$sb $strH$strM$strS\n")
        sb.clear()
    }

    bw.close()
    br.close()
}

fun makeString(str: String): String {
    val sb = StringBuilder()

    repeat(6 - str.length) {
        sb.append("0")
    }
    sb.append(str)

    return sb.toString()
}