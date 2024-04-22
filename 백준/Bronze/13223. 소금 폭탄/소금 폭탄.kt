import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (nh, nm, ns) = br.readLine().split(":").map { it.toInt() }
    val (wh, wm, ws) = br.readLine().split(":").map { it.toInt() }
    val now = nh * 3600 + nm * 60 + ns
    val want = wh * 3600 + wm * 60 + ws

    var calc = want - now
    if (calc <= 0) {
        calc += 24 * 3600
    }

    val rh = calc / 3600
    val rm = calc % 3600 / 60
    val rs = calc % 60

    bw.write("%02d:%02d:%02d".format(rh, rm, rs))

    bw.close()
    br.close()
}