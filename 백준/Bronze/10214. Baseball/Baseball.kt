import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {

    repeat(br.readLine().toInt()){
        var y = 0
        var k = 0

        repeat(9){
            val input = br.readLine().split(" ").map{ it.toInt() }
            y += input[0]
            k += input[1]
        }

        if(y > k)
            bw.write("Yonsei\n")
        else if(k > y)
            bw.write("Korea\n")
        else
            bw.write("Draw")
    }

    br.close()
    bw.close()
}