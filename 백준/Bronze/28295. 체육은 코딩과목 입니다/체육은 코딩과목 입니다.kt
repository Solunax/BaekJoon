import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dir = listOf("N", "E", "S", "W")
    var now = 0

    repeat(10){
        when(br.readLine().toInt()){
            1 -> now += 1
            2 -> now += 2
            3 -> now -= 1
        }

        if(now > 3)
            now -= 4

        if(now < 0)
            now = 3
    }

    bw.write(dir[now])

    bw.close()
    br.close()
}