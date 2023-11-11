import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val str = br.readLine()

    for (i in 1 .. n) {
        var check = true

        for (j in 0 .. n - i) {
            val mailBox = str.substring(j, j + i)

            for (k in 0 .. n - i) {
                if (j == k)
                    continue

                if (mailBox == str.substring(k, k + i))
                    check = false
            }
        }

        if (check){
            bw.write("$i")
            break
        }
    }

    bw.close()
    br.close()
}