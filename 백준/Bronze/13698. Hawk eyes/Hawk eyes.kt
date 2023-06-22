import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val cup = arrayOf(1, 2, 3, 4)
    br.readLine().forEach {
        when(it){
            'A' -> cup[0] = cup[1].also { cup[1] = cup[0] }
            'B' -> cup[0] = cup[2].also { cup[2] = cup[0] }
            'C' -> cup[0] = cup[3].also { cup[3] = cup[0] }
            'D' -> cup[1] = cup[2].also { cup[2] = cup[1] }
            'E' -> cup[1] = cup[3].also { cup[3] = cup[1] }
            'F' -> cup[2] = cup[3].also { cup[3] = cup[2] }
        }
    }

    bw.write("${cup.indexOf(1) + 1}\n${cup.indexOf(4) + 1}")

    bw.close()
    br.close()
}