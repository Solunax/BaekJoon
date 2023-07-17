import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (height, width) = br.readLine().split(" ").map { it.toInt() }

    repeat(height){
        val input = br.readLine().split(" ").map { it.toInt() }

        for(i in 0 until width * 3 step 3){
            when(rgb(input[i], input[i + 1], input[i + 2])){
                in 0 until 510000 -> bw.write("#")
                in 510000 until 1020000 -> bw.write("o")
                in 1020000 until 1530000 -> bw.write("+")
                in 1530000 until 2040000 -> bw.write("-")
                else -> bw.write(".")
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}

fun rgb(r : Int, g : Int, b : Int) : Int{
    return r * 2126 + g * 7152 + b * 722
}