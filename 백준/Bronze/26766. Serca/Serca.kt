import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        drawHeart()
    }

    bw.close()
    br.close()
}

fun drawHeart(){
    bw.write(" @@@   @@@ \n")
    bw.write("@   @ @   @\n")
    bw.write("@    @    @\n")
    bw.write("@         @\n")
    bw.write(" @       @ \n")
    bw.write("  @     @  \n")
    bw.write("   @   @   \n")
    bw.write("    @ @    \n")
    bw.write("     @     \n")
}