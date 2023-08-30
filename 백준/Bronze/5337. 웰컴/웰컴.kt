import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write(".  .   .\n|  | _ | _. _ ._ _  _\n|/\\|(/.|(_.(_)[ | )(/.")

    bw.close()
    br.close()
}