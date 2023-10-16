import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var alice = 0
    var bob = 0
    val n = br.readLine().toInt()
    val piece = br.readLine().split(" ").map{ it.toInt() }.sortedDescending()

    repeat(n){
        if(it % 2 == 0){
            alice += piece[it]
        } else {
            bob += piece[it]
        }
    }

    bw.write("$alice $bob")

    bw.close()
    br.close()
}