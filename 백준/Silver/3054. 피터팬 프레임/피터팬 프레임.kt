import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    val lineFirst = StringBuilder()
    val lineSecond = StringBuilder()
    val lineThird = StringBuilder()

    for(i in 1 .. input.length){
        if(i % 3 != 0){
            lineFirst.append("..#.")
            lineSecond.append(".#.#")
            if((i - 1) % 3 == 0 && i - 1 > 0){
                lineThird.append("*.${input[i - 1]}.")
            } else{
                lineThird.append("#.${input[i - 1]}.")
            }

            if(i == input.length){
                lineFirst.append(".")
                lineSecond.append(".")
                lineThird.append("#")
            }
        } else {
            lineFirst.append("..*.")
            lineSecond.append(".*.*")
            lineThird.append("*.${input[i - 1]}.")

            if(i == input.length){
                lineFirst.append(".")
                lineSecond.append(".")
                lineThird.append("*")
            }
        }
    }


    bw.write("$lineFirst\n" +
            "$lineSecond\n" +
            "$lineThird\n" +
            "$lineSecond\n" +
            "$lineFirst")

    bw.close()
    br.close()
}