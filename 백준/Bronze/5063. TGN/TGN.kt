import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (r, e, c) = br.readLine().split(" ").map { it.toInt() }

        if(e - c == r)
            bw.write("does not matter\n")
        else if(e - c < r)
            bw.write("do not advertise\n")
        else
            bw.write("advertise\n")
    }

    br.close()
    bw.close()
}