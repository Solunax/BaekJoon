import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val (n, m) = br.readLine().split(" ")
        var one = 0
        var zero = 0

        for(i in n.indices){
            if(n[i] != m[i]){
                if(m[i] == '1')
                    one++
                else
                    zero++
            }
        }

        bw.write("${max(one, zero)}\n")
    }

    bw.close()
    br.close()
}