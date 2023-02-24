import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(_, m) = br.readLine().split(" ").map { it.toInt() }
    var left = 1
    var right = m
    var move = 0
    repeat(br.readLine().toInt()){
        val location = br.readLine().toInt()

        if(location !in left .. right){
            val temp : Int
            if(location < left){
                temp = left - location
                left -= temp
                right -= temp
            }else{
                temp = location - right
                left += temp
                right += temp
            }

            move += temp
        }
    }

    bw.write("$move")

    br.close()
    bw.close()
}
