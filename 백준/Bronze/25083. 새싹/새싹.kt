import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    bw.write("         ,r'\"7\n")
    bw.write("r`-_   ,'  ,/\n")
    bw.write(" \\. \". L_r'\n")
    bw.write("   `~\\/\n")
    bw.write("      |\n")
    bw.write("      |")
    bw.flush()
    bw.close()
    br.close()
}