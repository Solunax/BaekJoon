import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toLong()
    var v = br.readLine().toInt()

    if(n >= 6)
        bw.write("Love is open door")
    else{
        repeat(n.toInt() - 1){
            when(v){
                1 -> {
                    bw.write("0\n")
                    v = 0
                }
                0 -> {
                    bw.write("1\n")
                    v = 1
                }
            }
        }
    }

    bw.close()
    br.close()
}