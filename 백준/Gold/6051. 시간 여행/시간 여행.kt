import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val sequence = Array<ArrayList<Int>>(n+1){ArrayList()}

    for(i in 1 .. n){
        val input = br.readLine().split(" ")

        when(input[0]){
            "a" -> {
                sequence[i].addAll(sequence[i-1])
                sequence[i].add(input[1].toInt())
            }
            "s" -> {
                sequence[i].addAll(sequence[i-1])
                sequence[i].removeLast()
            }
            "t" -> { sequence[i].addAll(sequence[input[1].toInt() - 1]) }
        }

        if(sequence[i].isNotEmpty())
            bw.write("${sequence[i].last()}\n")
        else
            bw.write("-1\n")
    }

    bw.close()
    br.close()
}
