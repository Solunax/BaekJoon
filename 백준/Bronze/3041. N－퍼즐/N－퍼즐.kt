import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val solved = Array(4){ Array(4){' '} }

    var ch = 'A'
    repeat(4){ i ->
        repeat(4){ j ->
            solved[i][j] = ch++
        }
    }
    solved[3][3] = '.'

    val puzzle = Array(4){ Array(4){' '} }
    repeat(4){
        puzzle[it] = br.readLine().toCharArray().toTypedArray()
    }

    var result = 0
    for(i in 0 until 4){
        for(j in 0 until 4){
            if(puzzle[i][j] != solved[i][j] && puzzle[i][j] != '.'){
                for(k in 0 until 4){
                    for(l in 0 until 4){
                        if(puzzle[i][j] == solved[k][l])
                            result += abs(i - k) + abs(j - l)
                    }
                }
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}