import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val index = listOf('A', 'G', 'C', 'T')
    val dec = arrayOf(
        arrayOf('A', 'C', 'A', 'G'),
        arrayOf('C', 'G', 'T', 'A'),
        arrayOf('A', 'T', 'C', 'G'),
        arrayOf('G', 'A', 'G', 'T')
    )
    br.readLine()
    
    val input = br.readLine()
    val stack = Stack<Char>()
    input.forEach {
        stack.push(it)
    }

    var row : Int
    var column : Int

    while(stack.size > 1){
        column = index.indexOf(stack.pop())
        row = index.indexOf(stack.pop())
        stack.push(dec[row][column])
    }

    bw.write("${stack.pop()}")

    br.close()
    bw.close()
}