import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (click, wait) = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    val pad = arrayOf(arrayOf('A', 'B', 'C'),
        arrayOf('D', 'E', 'F'),
        arrayOf('G', 'H', 'I'),
        arrayOf('J', 'K', 'L'),
        arrayOf('M', 'N', 'O'),
        arrayOf('P', 'Q', 'R', 'S'),
        arrayOf('T', 'U', 'V'),
        arrayOf('W', 'X', 'Y', 'Z'))

    var lastIndex = -1
    br.readLine().forEach { c ->
        if(c == ' '){
            result += click
            lastIndex = -1
        }
        else{
            var index = 0

            for(i in pad.indices){
                if(pad[i].contains(c)){
                    index = i
                    break
                }
            }

            if(lastIndex == index)
                result += wait

            result += (pad[index].indexOf(c) + 1) * click
            lastIndex = index
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}