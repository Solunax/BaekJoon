import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine()
    var index = 1
    var result = ""

    if (str.length < 4) {
        for (i in 1 until str.length) {
            if (str[0] != str[i]) {
                index = i
                break
            }
        }
    }

    if (index != str.length) {
        for (i in 1..999) {
            if (str.startsWith("$i")) {
                var t = str

                for (j in i..999) {
                    if (t.startsWith("$j")) {
                        t = t.substring("$j".length)
                    } else {
                        break
                    }

                    if (t.isEmpty()) {
                        result = "$i $j"
                        break
                    }
                }
            }

            if (result.isNotEmpty()) {
                break
            }
        }
    } else {
        result = "$str $str"
    }
    bw.write(result)

    bw.close()
    br.close()
}