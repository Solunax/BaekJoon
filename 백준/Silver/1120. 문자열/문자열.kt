import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (A, B) = br.readLine().split(" ")
    var result = A.length

    for(i in 0 .. B.length - A.length){
        var count = 0
        for(j in A.indices){
            if(A[j] != B[j + i])
                count++
        }

        if(result > count)
            result = count
    }
    bw.write("$result")

    bw.close()
    br.close()
}