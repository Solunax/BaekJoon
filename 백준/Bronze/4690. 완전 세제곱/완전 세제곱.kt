import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    for(a in 2 .. 100){
        for(b in 2 .. 100){
            for(c in 2 .. 100){
                for(d in 2 .. 100){
                    if((a * a * a) == (b * b * b + c * c * c + d * d * d)){
                        if(b <= c && c <= d)
                            bw.write("Cube = $a, Triple = ($b,$c,$d)\n")
                    }
                }
            }
        }
    }

    bw.close()
    br.close()
}