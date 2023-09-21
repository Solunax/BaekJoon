import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val history = Array(n){""}
    var index = 0
    var start = ' '
    var end = ' '

    repeat(n){
        history[it] = br.readLine()

        if(history[it] == "?")
            index = it
    }

    if(n != 1){
        when (index) {
            in 1 until n - 1 -> {
                start = history[index -1].last()
                end = history[index + 1].first()
            }
            0 -> end = history[1].first()
            n - 1 -> start = history[index - 1].last()
        }
    }

    val m = br.readLine().toInt()
    var result = ""

    if(n != 1){
        for(i in 0 until m){
            val word = br.readLine()

            when(index){
                in 1 until n - 1 -> {
                    if(!history.contains(word) && word.first() == start && word.last() == end){
                        result = word
                        break
                    }
                }
                0 -> if(!history.contains(word) && word.last() == end){
                    result = word
                    break
                }
                n - 1 -> if(!history.contains(word) && word.first() == start){
                    result = word
                    break
                }
            }
        }

        bw.write(result)
    } else
        bw.write(br.readLine())

    bw.close()
    br.close()
}