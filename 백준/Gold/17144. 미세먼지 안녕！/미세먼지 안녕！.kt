import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c, t) = br.readLine().split(" ").map { it.toInt() }
    val dr = arrayOf(-1, 0, 1, 0)
    val dc = arrayOf(0, -1, 0, 1)
    val air = Array(2){0}
    var airCount = 0
    var map = Array(r){Array(c){0}}

    repeat(r){
        map[it] = br.readLine().split(" ").map {v -> v.toInt() }.toTypedArray()
        if(map[it][0] == -1)
            air[airCount++] = it
    }

    for(x in 0 until t){
        val copy = Array(r){Array(c){0}}
        for(i in 0 until r){
            for(j in 0 until c){
                if(map[i][j] <= 0){
                    if(map[i][j] == -1)
                        copy[i][j] = map[i][j]
                    continue
                }

                var count = 0
                val amount = map[i][j] / 5

                for(k in 0 until 4){
                    val nextR = i + dr[k]
                    val nextC = j + dc[k]
                    if(nextR >= 0 && nextC >= 0 && nextR < r && nextC < c){
                        if(map[nextR][nextC] != -1){
                            copy[nextR][nextC] += amount
                            count++
                        }
                    }
                }
                copy[i][j] += map[i][j] - amount * count
            }
        }
        map = copy

        for(i in air[0]-1 downTo  1)
            map[i][0] = map[i-1][0]
        for(i in 0 until c-1)
            map[0][i] = map[0][i+1]
        for(i in 0 until air[0])
            map[i][c-1] = map[i+1][c-1]
        for(i in c-1 downTo 1)
            map[air[0]][i] = map[air[0]][i-1]

        map[air[0]][1] = 0

        for(i in air[1]+1 until  r-1)
            map[i][0] = map[i+1][0]
        for(i in 0 until c-1)
            map[r-1][i] = map[r-1][i+1]
        for(i in r-1 downTo  air[1])
            map[i][c-1] = map[i-1][c-1]
        for(i in c-1 downTo 1)
            map[air[1]][i] = map[air[1]][i-1]

        map[air[1]][1] = 0
    }

    var result = 0
    map.forEach {
        it.forEach { v->
            if(v > 0)
            result += v
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}
