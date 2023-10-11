import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    long(n)
    short(n)
    long(n)
    short(n)
    long(n)

    bw.close()
    br.close()
}

fun long(n : Int){
    repeat(n){
        repeat(n * 5){
            bw.write("@")
        }
        bw.write("\n")
    }
}

fun short(n : Int){
    repeat(n){
        repeat(n){
            bw.write("@")
        }
        bw.write("\n")
    }
}