import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var pos = 0
    var spin = 1
    repeat(br.readLine().toInt()){
        val (v1, v2, vPos) = br.readLine().split(" ").map { it.toInt() }

        spin = spin / v1 * v2

        if(vPos == 1){
            when(pos){
                0 -> pos = 1
                1 -> pos = 0
            }
        }
    }

    bw.write("$pos $spin")

    bw.close()
    br.close()
}