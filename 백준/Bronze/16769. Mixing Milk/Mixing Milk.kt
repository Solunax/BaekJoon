import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (cap1, amount1) = br.readLine().split(" ").map { it.toInt() }
    var (cap2, amount2) = br.readLine().split(" ").map { it.toInt() }
    var (cap3, amount3) = br.readLine().split(" ").map { it.toInt() }

    repeat(100){
        when(it % 3){
            0 -> {
                if(cap2 >= amount1 + amount2){
                    amount2 += amount1
                    amount1 = 0
                }else{
                    amount1 -= cap2 - amount2
                    amount2 = cap2
                }
            }
            1 -> {
                if(cap3 >= amount2 + amount3){
                    amount3 += amount2
                    amount2 = 0
                }else{
                    amount2 -= cap3 - amount3
                    amount3 = cap3
                }
            }
            2 -> {
                if(cap1 >= amount1 + amount3){
                    amount1 += amount3
                    amount3 = 0
                }else{
                    amount3 -= cap1 - amount1
                    amount1 = cap1
                }
            }
        }
    }

    bw.write("$amount1\n$amount2\n$amount3")

    bw.close()
    br.close()
}