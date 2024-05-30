import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        var result = true
        var original = br.readLine()

        if (original == "#") {
            break
        }

        while (true) {
            val check = br.readLine()

            if (check == "#") {
                break
            }
            if (result) {
                if (original.length != check.length) {
                    result = false
                }

                var diffCount = 0
                for (i in original.indices) {
                    if (original[i] != check[i]) {
                        diffCount++
                    }
                }

                if (diffCount != 1) {
                    result = false
                }
            }
            original = check
        }

        if (result) {
            bw.write("Correct\n")
        } else {
            bw.write("Incorrect\n")
        }
    }

    bw.close()
    br.close()
}