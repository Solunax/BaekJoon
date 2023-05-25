import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (v1, v2) = br.readLine().split(" ")

    while (v1.length != v2.length){
        if(v1.length > v2.length)
            v2 = "0$v2"
        else
            v1 = "0$v1"
    }

    for(i in v1.indices){
        bw.write("${(v1[i] - '0') + (v2[i] - '0')}")
    }

    bw.close()
    br.close()
}