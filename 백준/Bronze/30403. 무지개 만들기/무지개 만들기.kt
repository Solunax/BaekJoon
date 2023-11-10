import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val upperCheck = HashSet<Char>()
    val lowerCheck = HashSet<Char>()

    val upperRainbow = "ROYGBIV"
    val lowerRainbow = "roygbiv"

    br.readLine()
    br.readLine().forEach { c ->
        if (c in 'A' .. 'Z') {
            if (c in upperRainbow) {
                upperCheck.add(c)
            }
        } else if (c in 'a' .. 'z') {
            if (c in lowerRainbow) {
                lowerCheck.add(c)
            }
        }
    }

    if (upperCheck.size == 7 && lowerCheck.size == 7) {
        bw.write("YeS")
    } else if (upperCheck.size == 7) {
        bw.write("YES")
    } else if (lowerCheck.size == 7) {
        bw.write("yes")
    } else {
        bw.write("NO!")
    }

    bw.close()
    br.close()
}