import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (iE, iS, iM) = br.readLine().split(" ").map{ it.toInt() }
    var (e, s, m) = arrayOf(1, 1, 1)

    var year = 1
    while (true){
        if(e == iE && s == iS && m == iM)
            break

        if(++e == 16)
            e = 1

        if(++s == 29)
            s = 1

        if(++m == 20)
            m = 1

        year++
    }

    bw.write("$year")
    bw.close()
    br.close()
}