import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val n = br.readLine().toInt()
val map = Array(n){ Array(n){0} }
val dx = listOf(-1, -1, -1, 0, 0, 1, 1, 1)
val dy = listOf(-1, 0, 1, -1, 1, -1, 0, 1)

fun main() {
    repeat(n){
        val input = br.readLine()
        for(i in 0 until n){
            if(input[i] != '.')
                map[it][i] = input[i]-'0'
        }
    }

    val result = getResult()
    result.forEach {
        it.forEach { v ->
            bw.write(v)
        }
        bw.write("\n")
    }

    br.close()
    bw.close()
}

fun getResult() : Array<Array<String>>{
    val result = Array(n){ Array(n){""} }

    for(x in 0 until n){
        for(y in 0 until n){
            var count = 0

            if(map[x][y] != 0){
                result[x][y] = "*"
                continue
            }

            for(z in 0 until 8){
                if(x + dx[z] < 0 || x + dx[z] >= n || y + dy[z] < 0 || y + dy[z] >= n)
                    continue

                if(map[x + dx[z]][y + dy[z]] > 0)
                    count += map[x + dx[z]][y + dy[z]]
            }

            if(count < 10)
                result[x][y] = count.toString()
            else
                result[x][y] = "M"
        }
    }

    return result
}