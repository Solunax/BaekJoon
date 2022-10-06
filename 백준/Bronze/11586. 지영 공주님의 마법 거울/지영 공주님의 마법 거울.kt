import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){""}

    repeat(n){
        array[it] = br.readLine()
    }

    when(br.readLine().toInt()){
        1 -> {
            array.forEach {
                bw.write(it)
                bw.write("\n")
            }
        }
        2 -> {
            array.forEach {
                bw.write(it.reversed())
                bw.write("\n")
            }
        }
        3 -> {
            array.reversed().forEach {
                bw.write(it)
                bw.write("\n")
            }
        }
    }

    bw.close()
    br.close()
}