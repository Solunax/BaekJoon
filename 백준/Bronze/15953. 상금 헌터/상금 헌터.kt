import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val f1 = Array(6){Array(2){0}}
    f1[0] = arrayOf(1, 500)
    f1[1] = arrayOf(2, 300)
    f1[2] = arrayOf(3, 200)
    f1[3] = arrayOf(4, 50)
    f1[4] = arrayOf(5, 30)
    f1[5] = arrayOf(6, 10)

    val f2 = Array(5){Array(2){0}}
    f2[0] = arrayOf(1, 512)
    f2[1] = arrayOf(2, 256)
    f2[2] = arrayOf(4, 128)
    f2[3] = arrayOf(8, 64)
    f2[4] = arrayOf(16, 32)

    repeat(br.readLine().toInt()){
        val (rank1, rank2) = br.readLine().split(" ").map { it.toInt() }
        var sum = 0
        var result = 0
        if(rank1 != 0){
            for(i in f1){
                sum += i[0]
                if(sum >= rank1){
                    result += i[1]
                    break
                }
            }
        }
        
        sum = 0
        if(rank2 != 0){
            for(i in f2){
                sum += i[0]
                if(sum >= rank2){
                    result += i[1]
                    break
                }
            }
        }
        
        bw.write("${result * 10000}\n")
    }

    bw.close()
    br.close()
}
