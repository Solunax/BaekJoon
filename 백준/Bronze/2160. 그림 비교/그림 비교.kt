import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val picture = Array(n){ Array(5){ Array(7){""} } }

    repeat(n){ i ->
        repeat(5){ j ->
            picture[i][j] = br.readLine().split("").filter { it.isNotEmpty() }.toTypedArray()
        }
    }

    var resultIndex = Pair(0, 0)
    var diff = Int.MAX_VALUE

    for(i in 0 until n){
        for(j in i + 1 until n){
            val temp = checkDifferent(picture[i], picture[j])

            if(temp < diff){
                resultIndex = Pair(i, j)
                diff = temp
            }
        }
    }

    bw.write("${resultIndex.first + 1} ${resultIndex.second + 1}")

    bw.close()
    br.close()
}

fun checkDifferent(a : Array<Array<String>>, b : Array<Array<String>>) : Int {
    var diff = 0
    for(y in 0 until 5){
        for(x in 0 until 7){
            if(a[y][x] != b[y][x])
                diff++
        }
    }

    return diff
}