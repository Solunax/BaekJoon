import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val result = Array(5){0}
    repeat(br.readLine().toInt()){
        val (x, y) = br.readLine().split(" ").map{ it.toInt() }

        if(x == 0 || y == 0)
            result[4]++
        else if(y > 0){
            if(x > 0)
                result[0]++
            else
                result[1]++
        }else{
            if(x < 0)
                result[2]++
            else
                result[3]++
        }
    }

    repeat(4){
        bw.write("Q${it + 1}: ${result[it]}\n")
    }

    bw.write("AXIS: ${result.last()}")

    br.close()
    bw.close()
}